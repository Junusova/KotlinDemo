package SprintKotlin.KotlindemProject.dtoService

import SprintKotlin.KotlindemProject.dto.user.CreateUserDto
import SprintKotlin.KotlindemProject.dto.user.UserDto

interface UserDtoService {
  fun create(createUserDto: CreateUserDto): UserDto
}