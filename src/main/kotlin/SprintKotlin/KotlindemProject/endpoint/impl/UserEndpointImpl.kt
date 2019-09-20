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
class UserEndpointImpl()