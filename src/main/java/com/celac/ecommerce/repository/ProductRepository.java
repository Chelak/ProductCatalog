package com.celac.ecommerce.repository;

import com.celac.ecommerce.entity.Product;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;import org.springframework.stereotype.Repository;

/**
 * @author scelac
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
  @Query("SELECT p  from  Product p where p.featured = true")
  List<Product> findFeaturedProducts();
  @Query("SELECT p  from  Product p where p.category.id= :categoryId")
  List<Product> getByCategoryId(Long categoryId);
}
