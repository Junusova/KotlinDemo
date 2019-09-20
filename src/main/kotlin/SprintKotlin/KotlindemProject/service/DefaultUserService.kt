package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.user.CreateUserDto
import SprintKotlin.KotlindemProject.dto.user.UserDto
import SprintKotlin.KotlindemProject.dtoService.UserDtoService
import SprintKotlin.KotlindemProject.endpoint.impl.UserRequestMapper
import org.springframework.stereotype.Service

@Service
class DefaultUserService(
  private val userRequestMapper: UserRequestMapper
  ): UserDtoService {
  override fun create(createUserDto: CreateUserDto): UserDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}