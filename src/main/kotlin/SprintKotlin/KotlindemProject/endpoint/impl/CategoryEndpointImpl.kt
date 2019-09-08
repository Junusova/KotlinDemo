package SprintKotlin.KotlindemProject.endpoint.impl

import SprintKotlin.KotlindemProject.domain.CreateCategoryRequest
import SprintKotlin.KotlindemProject.dto.category.CreateCategoryDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

interface CategoriesRequestMapper {
  fun convertToCreateCategoryRequest(createCategoryDto: CreateCategoryDto): CreateCategoryRequest
}

@Service
class CategoryEndpointImpl : CategoriesRequestMapper {

  @Transactional
  override fun convertToCreateCategoryRequest(createCategoryDto: CreateCategoryDto): CreateCategoryRequest {

    return CreateCategoryRequest(
      name = createCategoryDto.name,
      amount = createCategoryDto.amount,
      description = createCategoryDto.description
    )
  }
}