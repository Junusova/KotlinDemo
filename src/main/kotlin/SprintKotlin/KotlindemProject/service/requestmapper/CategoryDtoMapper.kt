package SprintKotlin.KotlindemProject.service.requestmapper

import SprintKotlin.KotlindemProject.dto.category.CategoryDto
import SprintKotlin.KotlindemProject.model.Category
import org.springframework.stereotype.Service

interface CategoryDtoMapper {

  fun convertToDto(category: Category): CategoryDto
}

@Service
class CategoryDtoMapperService : CategoryDtoMapper {
  override fun convertToDto(category: Category) = CategoryDto(
    id = category.id!!,
    name = category.name,
    amount = category.amount,
    description = category.description
  )
}