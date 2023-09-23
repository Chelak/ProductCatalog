package com.celac.ecommerce.service;

import com.celac.ecommerce.entity.Product;
import com.celac.ecommerce.repository.ProductRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/** Created by user on 8/4/2015. */
@Service
public class ProductServiceImpl implements ProductService {
  private final ProductRepository repository;

  public ProductServiceImpl(ProductRepository repository) {
    this.repository = repository;
  }

  @Override
  public Product findById(Long productId) {
    return null;
  }

  @Override
  public void saveProduct(Product product) {}

  @Override
  public void removeProduct(Integer productId) {}

  @Override
  public List<Product> featuredProducts() {
    return repository.findFeaturedProducts();
  }

  @Override
  public List<Product> getProductsByCategory(Long categoryId) {
    return repository.getByCategoryId(categoryId);
  }

  @Override
  public Product getProductsByProductUrlPath(String productUrlPath) {
    return repository.getProductByUrlPath(productUrlPath);
  }
}
