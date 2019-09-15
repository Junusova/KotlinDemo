package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.domain.CreateCategoryRequest
import SprintKotlin.KotlindemProject.domain.UpdateCategoryRequest
import SprintKotlin.KotlindemProject.dto.category.CategoryDto
import SprintKotlin.KotlindemProject.dto.category.CreateCategoryDto
import SprintKotlin.KotlindemProject.dto.category.UpdateCategoryDto
import SprintKotlin.KotlindemProject.dtoService.CategoryDtoService
import SprintKotlin.KotlindemProject.endpoint.impl.CategoriesRequestMapper
import SprintKotlin.KotlindemProject.model.Category
import SprintKotlin.KotlindemProject.repo.CategoryRepository
import org.springframework.stereotype.Service

@Service
class DefaultCategoryService(
  private val categoryRepository: CategoryRepository,
  private val categoryDtoMapper: CategoriesRequestMapper,
  private val categoryService: CategoryService,
  private val categoryRequestMapper: CategoriesRequestMapper
) : CategoryDtoService {


  override fun delete(id: Long) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun getCategoryById(id: Long): Category = categoryRepository.getOne(id)

  override fun update(updateCategoryDto: UpdateCategoryDto, id: Long): CategoryDto {
    val updateCategoryRequest: UpdateCategoryRequest =
      categoryRequestMapper.convertToUpdateCategoryRequest(updateCategoryDto)

    val updateCategory: Category = categoryService.update(updateCategoryRequest, id)

    return categoryDtoMapper.convertToDto(updateCategory)
  }

  override fun create(createCategoryDto: CreateCategoryDto): CategoryDto {
    val createCategoryRequest: CreateCategoryRequest =
      categoryDtoMapper.convertToCreateCategoryRequest(createCategoryDto)

    val createCategory: Category = categoryService.create(createCategoryRequest)

    return categoryDtoMapper.convertToDto(createCategory)
  }
}
