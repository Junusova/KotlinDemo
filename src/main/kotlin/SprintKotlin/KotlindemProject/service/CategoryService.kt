package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.domain.CreateCategoryRequest
import SprintKotlin.KotlindemProject.domain.UpdateCategoryRequest
import SprintKotlin.KotlindemProject.model.Category
import SprintKotlin.KotlindemProject.model.Items
import SprintKotlin.KotlindemProject.repo.CategoryRepository
import SprintKotlin.KotlindemProject.repo.ItemsRepository

import org.springframework.stereotype.Service

interface CategoryService {
  fun create(createCategoryRequest: CreateCategoryRequest): Category
  fun update(updateCategoryRequest: UpdateCategoryRequest, id: Long): Category
  fun getCategoryById(id: Long): Category
  fun getItemById(id: Long): Items
}

@Service
class CategoryServiceImpl(
  private val categoryRepository: CategoryRepository,
  private val itemsRepository: ItemsRepository

) : CategoryService {

  override fun update(updateCategoryRequest: UpdateCategoryRequest, id: Long): Category {
    val updateCategory = getCategoryById(id)

    updateCategory.apply {
      name = updateCategoryRequest.name
      description = updateCategoryRequest.description
      amount = updateCategoryRequest.amount

    }
    return categoryRepository.save(updateCategory)
  }


  override fun create(createCategoryRequest: CreateCategoryRequest): Category {
    val category = Category(
      name = createCategoryRequest.name,
      amount = createCategoryRequest.amount,
      description = createCategoryRequest.description,
      items = listOf()

    )
    return  categoryRepository.save(category)
  }

  override fun getCategoryById(id: Long): Category = categoryRepository.getOne(id)
  override fun getItemById(id: Long): Items = itemsRepository.getOne(id)
}
