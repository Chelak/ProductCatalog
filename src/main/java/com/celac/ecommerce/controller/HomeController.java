package com.celac.ecommerce.controller;

import com.celac.ecommerce.entity.Product;
import com.celac.ecommerce.service.ProductService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  private final ProductService productService;

  public HomeController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping({"/", "/home"})
  public String getHomePage(Model model) {
    List<Product> featuredProducts = productService.featuredProducts();
    model.addAttribute("featuredProducts", featuredProducts);
    model.addAttribute("pageContent", "home-body");
    model.addAttribute("message", "Hello world!");
    return "layout";
  }
}
