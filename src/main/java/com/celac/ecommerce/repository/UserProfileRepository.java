package com.celac.ecommerce.repository;

import com.celac.ecommerce.dto.UserProfileDTO;
import com.celac.ecommerce.entity.UserProfile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
* @author scelac
*/
@Repository
public interface UserProfileRepository extends CrudRepository<UserProfile, Long> {
   @Query ("SELECT new com.celac.ecommerce.dto.UserProfileDTO(" +
           " u.id, u.userName, up.firstName, up.lastName,up.imgPath, up.address,up.phoneNumber,up.createdDateTime, up.updatedDateTime) " +
           " FROM User u " +
           " JOIN u.userProfile up " +
           " WHERE u.id = :userId")
   UserProfileDTO UserProfileDTOByUserId(Long userId);
   @Query("SELECT up FROM User as u " +
           " JOIN u.userProfile up " +
           " WHERE u.id = :userId")
   UserProfile getUserProfileByUserId(Long userId);
}
