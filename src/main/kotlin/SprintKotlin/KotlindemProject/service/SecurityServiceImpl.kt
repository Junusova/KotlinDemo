package SprintKotlin.KotlindemProject.service

import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Service


@Service
class SecurityServiceImpl : SecurityService {

  private val authenticationManager: AuthenticationManager

  override fun findLoggedInUsername(): String? {
    val userDetails = SecurityContextHolder.getContext().authentication.details
    return if (userDetails is UserDetails) {
      userDetails.username
    } else null

  }

}