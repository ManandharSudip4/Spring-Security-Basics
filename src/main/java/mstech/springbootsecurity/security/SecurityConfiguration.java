package mstech.springbootsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

  private static final String myAdmin = "admin";
  private static final String roleA = "ADMIN";

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
      .username(myAdmin)
      .password(myAdmin)
      .roles(roleA)
      .build();

    return new InMemoryUserDetailsManager(user, adminDetails);
  }

  @Bean
  public PasswordEncoder getPasswordEncoder() {
    return NoOpPasswordEncoder.getInstance();
  }

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http)
    throws Exception {
    http
      .authorizeHttpRequests(authorize ->
        authorize
          .requestMatchers("/admin")
          .hasRole(roleA)
          .requestMatchers("/user")
          .hasAnyRole(roleA, "USER")
          .requestMatchers("/")
          .permitAll()
      )
      .formLogin(Customizer.withDefaults());
    return http.build();
  }
}
