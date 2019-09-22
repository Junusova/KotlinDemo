package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.repo.UserRepository
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class DefaultUserServiceImpl(
  private val userRepository: UserRepository
) : UserAuthentificationService {

  @Throws(UsernameNotFoundException::class)
  @Transactional(readOnly = true)
  override fun loadUserByUsername(username: String): UserDetails {
    val email = userRepository.findByUsername(username)

    return with(email) {
      User.withUsername(username)
        .password(password)
        .authorities("USER")
        .build()
    }
  }

}