package SprintKotlin.KotlindemProject.dto.category

import java.math.BigDecimal

data class CategoryDto(
  val id: Long,
  val name: String,
  val description: String,
  val amount: BigDecimal
)

data class CreateCategoryDto(
  val name: String,
  val description: String,
  val amount: BigDecimal
)

data class UpdateCategoryDto(
  val name: String,
  val description: String,
  val amount: BigDecimal
)

data class GetAllCategoryRequestDto (
      val name: String
)