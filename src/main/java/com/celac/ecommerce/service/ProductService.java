package com.celac.ecommerce.service;

import com.celac.ecommerce.entity.Product;
import java.util.List;

/** Created by user on 8/4/2015. */
public interface ProductService {
  Product findById(Long productId);

  void saveProduct(Product product);

  void removeProduct(Integer productId);

  List<Product> featuredProducts();
  List<Product> getProductsByCategory(Long categoryId);
}
