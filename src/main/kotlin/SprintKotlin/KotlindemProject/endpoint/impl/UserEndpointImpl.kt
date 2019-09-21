package SprintKotlin.KotlindemProject.endpoint.impl

import SprintKotlin.KotlindemProject.domain.CreateUserRequest
import SprintKotlin.KotlindemProject.dto.user.CreateUserDto
import SprintKotlin.KotlindemProject.dto.user.UserDto
import SprintKotlin.KotlindemProject.model.User
import org.springframework.stereotype.Service

interface UserRequestMapper {
  fun convertToDto(user: User): UserDto
  fun convertToCreateUserRequest(createUserDto: CreateUserDto): CreateUserRequest
}

@Service
class UserEndpointImpl : UserRequestMapper {
  override fun convertToDto(user: User): UserDto {
    return UserDto(
      id = user.id,
      email = user.email,
      password = user.password,
      passwordConfirm = user.passwordConfirm
    )
  }

  override fun convertToCreateUserRequest(createUserDto: CreateUserDto): CreateUserRequest {
    return CreateUserRequest(
      email = createUserDto.email,
      password = createUserDto.password,
      passwordConfirm = createUserDto.passwordConfirm
    )
  }
}
