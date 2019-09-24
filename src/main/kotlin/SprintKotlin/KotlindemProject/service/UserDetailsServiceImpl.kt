package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.domain.CreateUserRequest
import SprintKotlin.KotlindemProject.dto.user.CreateUserDto
import SprintKotlin.KotlindemProject.dto.user.UserDto
import SprintKotlin.KotlindemProject.dtoService.UserDtoService
import SprintKotlin.KotlindemProject.endpoint.impl.UserRequestMapper
import SprintKotlin.KotlindemProject.model.User
import SprintKotlin.KotlindemProject.repo.UserRepository
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*


@Service
class UserDetailsServiceImpl(
  private val userRequestMapper: UserRequestMapper,
  private val userService: UserService,
  private val userDtoMapper: UserRequestMapper

) : UserDtoService {
  override fun create(createUserDto: CreateUserDto): UserDto {

    val createUserRequest: CreateUserRequest =
      userRequestMapper.convertToCreateUserRequest(createUserDto)

    val createUser: User = userService.create(createUserRequest)

    return userDtoMapper.convertToDto(createUser)
  }
}