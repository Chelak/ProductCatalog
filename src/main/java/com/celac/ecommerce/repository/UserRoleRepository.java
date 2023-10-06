package com.celac.ecommerce.repository;

import com.celac.ecommerce.entity.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
* @author scelac
*/
@Repository
public interface UserRoleRepository extends CrudRepository<UserRole,Long>{
}
