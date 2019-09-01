package SprintKotlin.KotlindemProject.dto.guard

import java.math.BigDecimal

data class GuardDto(
  val id: Long,
  val isActive: Boolean,
  val firstName: String,
  val lastName: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: String
)

data class CreateGuardDto(
  val email: String,
  val firstName: String,
  val lastName: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: String
)

data class UpdateGuardDto(
  val firstName: String,
  val lastName: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: String
)