package com.celac.ecommerce.service;

import com.celac.ecommerce.entity.Category;
import java.util.List;

/** Created by user on 8/5/2015. */
public interface CategoryService {
  List<Category> findAll();
  List<Category> getFeaturedCategory();
  Category findById(Integer categoryId);

  void addCategory(Category category);

  void editCategory(Category category, Integer categoryId);

  void removeCategory(Integer categoryId);

  Category getCategoryByUrlPath(String categoryUrlPath);
}
