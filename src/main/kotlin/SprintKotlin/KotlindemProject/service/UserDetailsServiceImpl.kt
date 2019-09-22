package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.endpoint.impl.UserRequestMapper
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
  private val userDtoMapper: UserRequestMapper,
  private val userRepository: UserRepository
) : UserDetailsService {


  @Transactional(readOnly = true)
  override fun loadUserByUsername(username: String): UserDetails {
    val user = userRepository!!.findByUsername(username)

    val grantedAuthorities = HashSet<GrantedAuthority>()
    for (role in user.getRoles()) {
      grantedAuthorities.add(SimpleGrantedAuthority(role.getName()))
    }

    return org.springframework.security.core.userdetails.User(
      user.getUsername(),
      user.getPassword(),
      grantedAuthorities
    )
  }
}

//  @Transactional
//  override fun create(createUserDto: CreateUserDto): UserDto {
//    val createUserRequest: CreateUserRequest =
//      userRequestMapper.convertToCreateUserRequest(createUserDto)
//
//    val createUser: User = userService.create(createUserRequest)
//
//    return userDtoMapper.convertToDto(createUser)
//  }
//
//}