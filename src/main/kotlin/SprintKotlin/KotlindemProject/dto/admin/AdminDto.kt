package SprintKotlin.KotlindemProject.dto.admin

import java.math.BigDecimal

data class AdminDto(
  val id: Long,
  val email: String,
  val isActive: Boolean,
  val firstName: String,
  val lastName: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: String
)

data class CreateAdminDto(
  val email: String,
  val firstName: String,
  val lastName: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: String
)

data class UpdateAdminDto(
  val firstName: String,
  val lastName: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: String
)