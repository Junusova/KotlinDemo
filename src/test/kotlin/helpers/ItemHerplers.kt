package helpers

import SprintKotlin.KotlindemProject.domain.CreateItemRequest
import java.math.BigDecimal

fun takeCreateItemRequest(): CreateItemRequest {
  return  CreateItemRequest(
    email = "test@gmail.com",
    name = "TestName",
    amount = BigDecimal.valueOf(56.96),
    price = BigDecimal.valueOf(55.86),
    description = "Test Description",
    category = getCategory(),
    isActive = true

  )
}