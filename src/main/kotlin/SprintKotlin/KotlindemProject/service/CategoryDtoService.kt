package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.category.CategoryDto
import SprintKotlin.KotlindemProject.dto.category.CreateCategoryDto
import SprintKotlin.KotlindemProject.dto.category.UpdateCategoryDto

interface CategoryDtoService {
  fun create(createCategoryDto: CreateCategoryDto): CategoryDto
  fun update(updateCategoryDto: UpdateCategoryDto,id: Long): CategoryDto
}