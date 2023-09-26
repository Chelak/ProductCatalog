package com.celac.ecommerce.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/** Created by user on 8/5/2015. */
@Controller
public class AdminDashboardPageController {

  @Secured("ADMIN")
  @GetMapping(value = {"/admin-dashboard", "/admin-dashboard/"})
  public String getAdminPage(ModelMap model) {
    model.addAttribute("pageTitle", "Admin Dashboard");
    return "admin-dashboard-layout";
  }
  @Secured("SALE_MANAGER")
  @GetMapping("/sale-dashboard")
  public String getSaleDashboard(ModelMap model){
    model.addAttribute("pageTitle", "Sale dashboard");
    return "sale-dashboard-layout";
  }
}
