package com.celac.ecommerce.controller;

import com.celac.ecommerce.dto.AddNewUserRequestDTO;
import com.celac.ecommerce.dto.UserProfileDTO;
import com.celac.ecommerce.entity.User;
import com.celac.ecommerce.entity.enums.RoleName;
import com.celac.ecommerce.security.userdetails.CustomUserDetails;
import com.celac.ecommerce.service.UserAuthenticatedService;
import com.celac.ecommerce.service.UserProfileService;
import java.util.Objects;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
* @author scelac
*/
@Secured({"ADMIN","SALE_MANAGER"})
@Controller
public class UserProfileController {
    private final UserAuthenticatedService userAuthenticatedService;
    private final UserProfileService userProfileService;

    public UserProfileController(UserAuthenticatedService userAuthenticatedService, UserProfileService userProfileService) {
        this.userAuthenticatedService = userAuthenticatedService;
        this.userProfileService = userProfileService;
    }

    @GetMapping("/user/profile")
    public String getUserProfilePage(Model model){
        model.addAttribute("pageTitle", "Admin Dashboard");
        CustomUserDetails customUserDetails =  userAuthenticatedService.getAuthenticatedUserFromSecurityContextHolder();
        UserProfileDTO userProfileDTO = new UserProfileDTO();
        String layout =  "admin-dashboard-layout";
        if (Objects.nonNull(customUserDetails)){
            userProfileDTO  = userProfileService.getUserProfileDTOByUserId(customUserDetails.getId());
            if (customUserDetails.hasPrivilege(RoleName.SALE_MANAGER)){
                layout = "sale-dashboard-layout";
                model.addAttribute("pageTitle", "Sale Dashboard");
            }
        }

        model.addAttribute("pageContent", "user-profile");
        model.addAttribute("userProfile", userProfileDTO);

        return layout;
    }

    @PostMapping("/update-user-profile")
    public ResponseEntity<String> addNewUser(@RequestBody UserProfileDTO userProfileDTO) {
        userProfileService.updateUserProfile(userProfileDTO);
        return ResponseEntity.ok("Success");
    }
}
