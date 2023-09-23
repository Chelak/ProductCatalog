package com.celac.ecommerce.controller;

import com.celac.ecommerce.dto.AddNewUserRequestDTO;
import com.celac.ecommerce.dto.LoginRequestDTO;
import com.celac.ecommerce.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author scelac
 */
@Controller
public class AuthenticationPageController {

    private final AuthenticationService authenticationService;

    public AuthenticationPageController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping(value = "/login.html")
    public String getLoginPage(Model model) {
        model.addAttribute("pageTitle", "Authorization Page");
        model.addAttribute("pageContent", "login");
        return "authentication-layout";
    }
    @GetMapping(value = "/reset-password.html")
    public String getResetPasswordPage(Model model) {
        model.addAttribute("pageTitle", "Reset Password Page");
        model.addAttribute("pageContent", "reset-password");
        return "authentication-layout";
    }

    @GetMapping(value = "/registration.html")
    public String getRegistrationPage(Model model) {
        model.addAttribute("pageTitle", "Registration Page");
        model.addAttribute("pageContent", "registration");
        return "authentication-layout";
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDTO authenticationRequest) {
        String message = authenticationService.authenticate(authenticationRequest);
        return ResponseEntity.ok(message);
    }
    @PostMapping("/add-new-user")
    public ResponseEntity<String> addNewUser(@RequestBody AddNewUserRequestDTO registryRequest) {
//        String message = authenticationService.authenticate(authenticationRequest);
        return ResponseEntity.ok("Success");
    }
}
