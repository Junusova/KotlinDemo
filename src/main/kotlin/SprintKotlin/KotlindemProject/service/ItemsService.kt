package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.domain.CreateItemRequest
import SprintKotlin.KotlindemProject.model.Category
import SprintKotlin.KotlindemProject.model.Items
import SprintKotlin.KotlindemProject.repo.CategoryRepository
import org.springframework.stereotype.Service

interface ItemsService {
  fun create(createItemRequest: CreateItemRequest): Items
  fun getById(id: Long): Category?
}

@Service
class ItemServiceImpl(
  private val categoryRepository: CategoryRepository
) : ItemsService {


  override fun create(createItemRequest: CreateItemRequest): Items {
    val item = Items(
      categories = createItemRequest.category,
      name = createItemRequest.name,
      amount = createItemRequest.amount,
      price = createItemRequest.price,
      description = createItemRequest.description,
      isActive = createItemRequest.isActive
    )

    return item
  }

  override fun getById(id: Long): Category? = categoryRepository.getOne(id)
}


