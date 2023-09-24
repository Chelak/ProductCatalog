package com.celac.ecommerce.service.impl;

import com.celac.ecommerce.entity.User;
import com.celac.ecommerce.repository.UserRepository;
import com.celac.ecommerce.security.userdetails.CustomUserDetails;
import java.util.Objects;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author scelac
 */
@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
  private final UserRepository userRepository;

  public CustomUserDetailsService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    final User user = userRepository.findByUserName(userName);
    if (Objects.isNull(user)) {
      throw new UsernameNotFoundException("Username not found");
    }
    return new CustomUserDetails(
        user.getId(),
        user.getUserName(),
        user.getPassword(),
        user.getRoles(),
        user.getAccountNonLocked(),
        true,
        user.getFirstName(),
        user.getLastName());
  }
}
