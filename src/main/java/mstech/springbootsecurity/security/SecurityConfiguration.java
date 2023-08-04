package mstech.springbootsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfiguration {

  @Bean
  public UserDetailsService users() {
    UserDetails user = User
      .builder()
      .username("user")
      .password("user")
      .roles("USER")
      .build();

    UserDetails adminDetails = User
      .builder()
      .username("admin")
      .password("admin")
      .roles("ADMIN")
      .build();

    return new InMemoryUserDetailsManager(user, adminDetails);
  }

  @Bean
  public PasswordEncoder getPasswordEncoder() {
    return NoOpPasswordEncoder.getInstance();
  }
}
