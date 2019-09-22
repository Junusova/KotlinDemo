package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.domain.CreateUserRequest
import SprintKotlin.KotlindemProject.model.User
import SprintKotlin.KotlindemProject.repo.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

interface UserService {
  fun create(createUserRequest: CreateUserRequest): User
}

@Service
class UserServiceImpl(
  private val userRepository: UserRepository
) : UserService {


  override fun create(createUserRequest: CreateUserRequest): User {
    val user = User(
      email = createUserRequest.email,
      password = createUserRequest.password,
      passwordConfirm = createUserRequest.passwordConfirm,
      roles = setOf()
    )
    return userRepository.save(user)
  }

}