package com.celac.ecommerce.controller;

import com.celac.ecommerce.entity.Category;
import com.celac.ecommerce.entity.Product;
import com.celac.ecommerce.service.CategoryService;
import com.celac.ecommerce.service.ProductService;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/** Created by user on 8/5/2015. */
@Controller
public class CategoryController {
  private final CategoryService categoryService;
  private final ProductService productService;

  public CategoryController(CategoryService categoryService, ProductService productService) {
    this.categoryService = categoryService;
    this.productService = productService;
  }

  @GetMapping(value = {"/{categoryUrlPath}", "/{categoryUrlPath}/"})
  public String getCategoryPage(@PathVariable String categoryUrlPath, ModelMap model) {
    Category category =  categoryService.getCategoryByUrlPath(categoryUrlPath);
    List<Product> products = Collections.emptyList();
    List<Category> mainMenu = categoryService.getFeaturedCategory();
    if (Objects.nonNull(category)) {
      products = productService.getProductsByCategory(category.getId());
    }
    model.addAttribute("mainMenu", mainMenu);
    model.addAttribute("products", products);
    model.addAttribute("pageContent", "category-body");
    model.addAttribute("message", "Category page!");
    return "layout";
  }
}
