package SprintKotlin.KotlindemProject.dtoService

import SprintKotlin.KotlindemProject.dto.category.CategoryDto
import SprintKotlin.KotlindemProject.dto.category.CreateCategoryDto
import SprintKotlin.KotlindemProject.dto.category.GetAllCategoryRequestDto
import SprintKotlin.KotlindemProject.dto.category.UpdateCategoryDto
import SprintKotlin.KotlindemProject.model.Category

interface CategoryDtoService {
  fun create(createCategoryDto: CreateCategoryDto): CategoryDto
  fun update(updateCategoryDto: UpdateCategoryDto,id: Long): CategoryDto
  fun getCategoryById(id: Long) : Category
  fun delete(id: Long)
}