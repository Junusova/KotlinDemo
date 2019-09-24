package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.domain.CreateUserRequest
import SprintKotlin.KotlindemProject.model.User
import SprintKotlin.KotlindemProject.repo.UserRepository
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

interface UserService {
  fun create(createUserRequest: CreateUserRequest): User
}

@Service
class UserServiceImpl(
  private var userRepository: UserRepository
) : UserDetailsService, UserService {


  override fun create(createUserRequest: CreateUserRequest): User {
    val user = User(
      email = createUserRequest.email,
      password = createUserRequest.password,
      passwordConfirm = createUserRequest.passwordConfirm,
      roles = setOf()
    )
    return userRepository.save(user)
  }

  override fun loadUserByUsername(username: String): User {
    return userRepository.findByEmail(username)
  }

}