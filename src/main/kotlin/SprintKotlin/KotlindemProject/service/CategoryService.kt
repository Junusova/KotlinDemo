package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.domain.CreateCategoryRequest
import SprintKotlin.KotlindemProject.model.Category
import org.springframework.stereotype.Service

interface CategoryService {
  fun create(createCategoryRequest: CreateCategoryRequest): Category
}

@Service
class CategoryServiceImpl : CategoryService {

  override fun create(createCategoryRequest: CreateCategoryRequest): Category {
    val category = Category(
      name = createCategoryRequest.name,
      amount = createCategoryRequest.amount,
      description = createCategoryRequest.description,
      items = listOf()

    )

    return category
  }
}