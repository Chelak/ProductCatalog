package com.celac.ecommerce.repository;

import com.celac.ecommerce.entity.Category;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author scelac
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    @Query("SELECT c FROM Category as c where c.featured = true")
    List<Category> getFeaturedCategory();
    @Query("select c from Category as c where c.urlPath = :categoryUrlPath")
    Category getCategoryByUrlPath(String categoryUrlPath);
}
