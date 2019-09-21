package SprintKotlin.KotlindemProject.domain

data class CreateUserRequest(
  val email: String,
  val password: String,
  val passwordConfirm: String
)