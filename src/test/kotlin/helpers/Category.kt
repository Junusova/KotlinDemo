package helpers

import SprintKotlin.KotlindemProject.model.Category
import java.math.BigDecimal

fun getCategory() : Category {
  return Category(
    items = listOf(),
    name = "Test Category Name",
    description = "Test Description of Category",
    amount = BigDecimal.valueOf(56.21)
  )
}