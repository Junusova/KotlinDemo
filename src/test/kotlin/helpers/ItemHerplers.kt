package helpers

import SprintKotlin.KotlindemProject.model.Items
import java.math.BigDecimal

fun takeCreateItemRequest(): Items {
  return  Items(
    name = "TestName",
    amount = BigDecimal.valueOf(56.96),
    price = BigDecimal.valueOf(55.86),
    description = "Test Description",
    category = getCategory(),
    isActive = true
  ).apply { id = 1 }
}