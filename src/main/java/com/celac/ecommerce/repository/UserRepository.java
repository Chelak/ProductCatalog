package com.celac.ecommerce.repository;

import com.celac.ecommerce.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author scelac
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  User findByUserName(String userName);

  @Query("SELECT EXISTS(SELECT u.id from User as u WHERE u.userName= :userName)")
  Boolean exitUserByUsername(String userName);
}
