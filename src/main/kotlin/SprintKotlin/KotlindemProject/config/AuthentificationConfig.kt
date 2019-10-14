package SprintKotlin.KotlindemProject.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationProvider
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.password.PasswordEncoder

@Configuration
class AuthentificationConfig (
  private val passwordEncoder: PasswordEncoder,
  private val userDetailsService: UserDetailsService
) {

  @Bean
  fun databaseAuthenticationProvider(): AuthenticationProvider {
    val daoAuthenticationProvider = DaoAuthenticationProvider()

    daoAuthenticationProvider.setUserDetailsService(userDetailsService)
    daoAuthenticationProvider.setPasswordEncoder(passwordEncoder)

    return daoAuthenticationProvider
  }
}