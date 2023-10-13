package com.celac.ecommerce.controller;

import com.celac.ecommerce.dto.UserProfileDTO;
import com.celac.ecommerce.security.userdetails.CustomUserDetails;
import com.celac.ecommerce.service.UserProfileService;
import java.security.Principal;
import java.util.Objects;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/** Created by user on 8/5/2015. */
@Controller
public class AdminDashboardPageController {
  private final UserProfileService userProfileService;

  public AdminDashboardPageController(UserProfileService userProfileService) {
    this.userProfileService = userProfileService;
  }

  @Secured("ADMIN")
  @GetMapping(value = {"/admin-dashboard", "/admin-dashboard/"})
  public String getAdminPage(ModelMap model, @AuthenticationPrincipal CustomUserDetails userDetails) {
    UserProfileDTO userProfileDTO = new UserProfileDTO();
    if(Objects.nonNull(userDetails)){
      userProfileDTO =  userProfileService.getUserProfileDTOByUserId(userDetails.getId());
    }

    model.addAttribute("userProfile", userProfileDTO);
    model.addAttribute("pageTitle", "Admin Dashboard");
    model.addAttribute("pageContent", "admin-dashboard");
    return "admin-dashboard-layout";
  }
  @Secured("SALE_MANAGER")
  @GetMapping("/sale-dashboard")
  public String getSaleDashboard(ModelMap model, @AuthenticationPrincipal CustomUserDetails userDetails){
    UserProfileDTO userProfileDTO = new UserProfileDTO();
    if(Objects.nonNull(userDetails)){
      userProfileDTO =  userProfileService.getUserProfileDTOByUserId(userDetails.getId());
    }
    model.addAttribute("userProfile", userProfileDTO);
    model.addAttribute("pageTitle", "Sale dashboard");
    model.addAttribute("pageContent", "admin-dashboard");
    return "sale-dashboard-layout";
  }
}
