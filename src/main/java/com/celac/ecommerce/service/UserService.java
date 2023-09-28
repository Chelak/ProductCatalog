package com.celac.ecommerce.service;

import com.celac.ecommerce.dto.AddNewUserRequestDTO;
import com.celac.ecommerce.entity.User;

/**
* @author scelac
*/
public interface UserService {

    User saveUser(AddNewUserRequestDTO addNewUserRequestDTO);

}
