package SprintKotlin.KotlindemProject.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.authentication.AuthenticationSuccessHandler
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler
import org.springframework.security.web.savedrequest.NullRequestCache


@Configuration
@EnableWebSecurity
class WebSecurityConfig : GlobalMethodSecurityConfiguration()

class SecurityConfig(

  private val successHandler: AuthenticationSuccessHandler,
  private val logOutHandler: LogoutSuccessHandler,
  private val userDetailsService: UserDetailsService,
  private val passwordEncoder: PasswordEncoder,
  private val objectMapper: ObjectMapper
  ): WebSecurityConfigurerAdapter() {

  @Throws(Exception::class)
  fun jsonAuthenticationFilter(): JsonLoginFilter {
    val filter = JsonLoginFilter(objectMapper, "/api/login")
    filter.setAuthenticationSuccessHandler(successHandler)
    filter.setAuthenticationFailureHandler(SimpleUrlAuthenticationFailureHandler())
    filter.setAuthenticationManager(authenticationManager())
    return filter
  }

  @Bean
  fun getDaoAuthProvider(): DaoAuthenticationProvider {
    val provider = DaoAuthenticationProvider()
    provider.setPasswordEncoder(passwordEncoder)
    provider.setUserDetailsService(userDetailsService)
    return provider
  }

  @Throws(Exception::class)
  override fun configure(http: HttpSecurity) {
    http.cors()
      .and().addFilterAt(jsonAuthenticationFilter(), UsernamePasswordAuthenticationFilter::class.java).cors()
      .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
      .and().authorizeRequests()
      .antMatchers("/api/login").permitAll()
      .and()
      .logout()
      .logoutSuccessHandler(logOutHandler)
      .logoutUrl("/api/logout")
      .invalidateHttpSession(true)
      .deleteCookies("SESSION")
      .and()
      .authorizeRequests().antMatchers("/api/**").authenticated()
      .and()
      .requestCache()
      .requestCache(NullRequestCache())
  }
}