package com.celac.ecommerce.controller;

import com.celac.ecommerce.entity.Category;
import com.celac.ecommerce.entity.Product;
import com.celac.ecommerce.service.CategoryService;
import com.celac.ecommerce.service.ProductService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/** Created by user on 8/5/2015. */
@Controller
public class ProductPageController {
  private final CategoryService categoryService;
  private final ProductService productService;

  public ProductPageController(CategoryService categoryService, ProductService productService) {
    this.categoryService = categoryService;
    this.productService = productService;
  }

  @GetMapping(value = {"/{categoryUrlPath}/{productUrlPath}.html"})
  public String getProductDetailedPage(@PathVariable String categoryUrlPath, @PathVariable String productUrlPath, ModelMap model) {
    List<Category> mainMenu = categoryService.getFeaturedCategory();
    String urlPat = "/"+categoryUrlPath+"/"+productUrlPath;
    Product product  = productService.getProductsByProductUrlPath(urlPat);

    model.addAttribute("mainMenu", mainMenu);
    model.addAttribute("product", product);
    model.addAttribute("pageContent", "product-detailed-body");
    model.addAttribute("pageTitle", "Product page");
    return "layout";
  }
}
