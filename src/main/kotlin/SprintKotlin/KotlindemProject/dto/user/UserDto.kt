package SprintKotlin.KotlindemProject.dto.user

import javax.validation.constraints.Email

data class UserDto(
  val id: Long,
  val email: Email,
  val password: String,
  val passwordConfirm: String
)

data class CreateUserDto(
  val email: Email,
  val password: String,
  val passwordConfirm: String
)