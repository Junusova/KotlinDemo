package SprintKotlin.KotlindemProject.domain

import javax.validation.constraints.Email

data class CreateUserRequest(
  val email: Email,
  val password: String,
  val passwordConfirm: String
)