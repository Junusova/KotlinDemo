package SprintKotlin.KotlindemProject.dto.user

data class UserDto(
  val id: Long,
  val email: String,
  val password: String,
  val passwordConfirm: String
)

data class CreateUserDto(
  val email: String,
  val password: String,
  val passwordConfirm: String
)