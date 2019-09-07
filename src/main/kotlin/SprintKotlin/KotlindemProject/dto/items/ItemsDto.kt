package SprintKotlin.KotlindemProject.dto.items

import java.math.BigDecimal

data class ItemsDto(
  val id: Long,
  val isActive: Boolean,
  val name: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: Long
)

data class CreateItemsDto(
  val email: String,
  val name: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: Long
)

data class UpdateItemsDto(
  val name: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: Long
)