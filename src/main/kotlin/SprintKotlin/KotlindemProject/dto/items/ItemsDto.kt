package SprintKotlin.KotlindemProject.dto.items

import SprintKotlin.KotlindemProject.dto.category.CategoryDto
import SprintKotlin.KotlindemProject.dto.category.UpdateCategoryDto
import java.math.BigDecimal

data class ItemsDto(
  val id: Long,
  val isActive: Boolean,
  val name: String,
  val amount: BigDecimal,
  val price: BigDecimal,
  val description: String
)

data class CreateItemsDto(
  val email: String,
  val name: String,
  val amount: BigDecimal,
  val price: BigDecimal,
  val description: String,
  val categoryId: Long
)

data class UpdateItemsDto(
  val name: String,
  val amount: BigDecimal,
  val price: BigDecimal,
  val description: String,
  val categoryId: Long,
  val email: String
)