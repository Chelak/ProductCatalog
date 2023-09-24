package com.celac.ecommerce.security.userdetails;

import com.celac.ecommerce.entity.UserRole;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author scelac
 */
public class CustomUserDetails implements UserDetails {
  private Long id;
  private String username;
  private String password;
  private String firstName;
  private String lastName;
  private Boolean accountNonLocked;
  private Boolean enabled;
  private Collection<? extends GrantedAuthority> authorities;

  public CustomUserDetails(
      Long id,
      String username,
      String password,
      List<UserRole> roleList,
      Boolean accountNonLocked,
      Boolean enabled,
      String firstName,
      String lastName) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.authorities = mapAuthority(roleList);
    this.accountNonLocked = accountNonLocked;
    this.enabled = enabled;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return accountNonLocked;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return enabled;
  }

  public Long getId() {
    return id;
  }

  private Collection<? extends GrantedAuthority> mapAuthority(List<UserRole> roleNameList) {
    return roleNameList.stream()
        .map(role -> new SimpleGrantedAuthority(role.getRoleName().name()))
        .collect(Collectors.toList());
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
