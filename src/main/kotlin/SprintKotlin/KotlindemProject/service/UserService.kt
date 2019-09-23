package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.model.User
import SprintKotlin.KotlindemProject.repo.UserRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

//interface UserService {
//  fun create(createUserRequest: CreateUserRequest): User
//  fun findByUsername(username: String): User
//}

@Service
class UserServiceImpl(
  private val userRepository: UserRepository,
  private val passwordEncoder: PasswordEncoder
) : UserDetailsService {

  override fun loadUserByUsername(username: String): User {
    return userRepository.findByEmail(username)
  }


  fun saveAccount(user: User): User {
    user.password = this.passwordEncoder.encode(user.password)
    return userRepository.save(user)
  }

}


//  override fun create(createUserRequest: CreateUserRequest): User {
//    val user = User(
//      email = createUserRequest.email,
//      password = createUserRequest.password,
//      passwordConfirm = createUserRequest.passwordConfirm,
//      roles = setOf()
//    )
//    return userRepository.save(user)
//  }
}