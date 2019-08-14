package SprintKotlin.KotlindemProject.dto.customer

import java.math.BigDecimal

data class CustomerDto(
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

data class CreateCustomerDto(
  val email: String,
  val firstName: String,
  val lastName: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: String
)

data class UpdateCustomerDto(
  val firstName: String,
  val lastName: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: String
)