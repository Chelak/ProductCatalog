package com.celac.ecommerce.service;

import com.celac.ecommerce.entity.Category;
import com.celac.ecommerce.repository.CategoryRepository;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

/** Created by user on 8/5/2015. */
@Service
public class CategoryServiceImpl implements CategoryService {
  private final CategoryRepository categoryRepository;

  public CategoryServiceImpl(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  @Override
  public List<Category> findAll() {
    return Collections.emptyList();
  }

    @Override
    public List<Category> getFeaturedCategory() {
          return categoryRepository.getFeaturedCategory();
    }

    @Override
  public Category findById(Integer categoryId) {
    return null;
  }

  @Override
  public void addCategory(Category category) {}

  @Override
  public void editCategory(Category category, Integer categoryId) {}

  @Override
  public void removeCategory(Integer categoryId) {}

  @Override
  public Category getCategoryByUrlPath(String categoryUrlPath) {
    return categoryRepository.getCategoryByUrlPath(categoryUrlPath);
  }
}
