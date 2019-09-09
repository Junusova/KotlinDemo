package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.domain.CreateCategoryRequest
import SprintKotlin.KotlindemProject.dto.category.CategoryDto
import SprintKotlin.KotlindemProject.dto.category.CreateCategoryDto
import SprintKotlin.KotlindemProject.dto.category.UpdateCategoryDto
import SprintKotlin.KotlindemProject.endpoint.impl.CategoriesRequestMapper
import SprintKotlin.KotlindemProject.model.Category
import SprintKotlin.KotlindemProject.repo.CategoryRepository
import org.springframework.stereotype.Service

@Service
class DefaultCategoryService(
  private val categoryRepository: CategoryRepository,
  private val categoryDtoMapper: CategoriesRequestMapper,
  private val categoryService: CategoryService
) : CategoryDtoService {

  override fun getCategoryById(id: Long): Category = categoryRepository.getOne(id)

  override fun update(updateCategoryDto: UpdateCategoryDto, id: Long): CategoryDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun create(createCategoryDto: CreateCategoryDto): CategoryDto {
    val createCategoryRequest: CreateCategoryRequest =
      categoryDtoMapper.convertToCreateCategoryRequest(createCategoryDto)

    val createCategory: Category = categoryService.create(createCategoryRequest)

    return categoryDtoMapper.convertToDto(createCategory)

  }
}
