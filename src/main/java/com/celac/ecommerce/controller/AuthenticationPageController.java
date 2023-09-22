package com.celac.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author scelac
 */
@Controller
public class AuthenticationPageController {

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
}
