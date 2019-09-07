package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.items.CreateItemsDto
import SprintKotlin.KotlindemProject.dto.items.ItemsDto
import SprintKotlin.KotlindemProject.dto.items.UpdateItemsDto
import SprintKotlin.KotlindemProject.model.Category
import SprintKotlin.KotlindemProject.model.Items
import SprintKotlin.KotlindemProject.repo.ItemsRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.math.BigDecimal

interface ItemsDtoService {
  fun create(createItemsDto: CreateItemsDto): ItemsDto
  fun update(updateItemsDto: UpdateItemsDto, id: Long): ItemsDto
  fun findById(id: Long): ItemsDto
  fun findByName(name: String): ItemsDto
  fun findByAmount(amount: Int): ItemsDto
  fun findByPrice(price: BigDecimal): ItemsDto
  fun findByDescription(description: String): ItemsDto
  fun findByCategory(category: Category): ItemsDto
  fun delete(id: Long)
}

@Service
class DefaultItemsDtoService(

  private val itemsRepository: ItemsRepository
) : ItemsDtoService {

  @Transactional
  override fun create(createItemsDto: CreateItemsDto): ItemsDto {

    val item = itemsRepository.save(
      Items(
        name = createItemsDto.name,
        amount = createItemsDto.amount,
        description = createItemsDto.description,
        categories = createItemsDto.category,
        price = createItemsDto.price,
        is_active = true
      )
    )

    return ItemsDto(
      name = item.name,
      amount = item.amount,
      description = item.description,
      category = item.categories,
      price = item.price,
      id = item.id!!,
      isActive = item.is_active

    )
  }

  @Transactional
  override fun update(updateItemsDto: UpdateItemsDto, id: Long): ItemsDto {
    val items = itemsRepository.getOne(id)
    items.apply {
      name = updateItemsDto.name
      amount = updateItemsDto.amount
      category = updateItemsDto.category
      price = updateItemsDto.price
      description = updateItemsDto.description
    }

    itemsRepository.save(items)

    return ItemsDto(
      name = items.name,
      amount = items.amount,
      category = items.category,
      price = items.price,
      description = items.description,
      isActive = items.is_active,
      id = items.id!!
    )
  }

  @Transactional(readOnly = true)
  override fun findById(id: Long): ItemsDto {
    val items = itemsRepository.getOne(id)
    return ItemsDto(
      name = items.name,
      amount = items.amount,
      category = items.category,
      price = items.price,
      description = items.description,
      isActive = items.is_active,
      id = items.id!!
    )
  }


  @Transactional(readOnly = true)
  override fun findByName(name: String): ItemsDto {
    val items = itemsRepository.findByName(name)
    return ItemsDto(
      name = items.name,
      amount = items.amount,
      category = items.category,
      price = items.price,
      description = items.description,
      isActive = items.is_active,
      id = items.id!!
    )
  }

  @Transactional(readOnly = true)
  override fun findByAmount(amount: Int): ItemsDto {
    val items = itemsRepository.findByAmount(amount)
    return ItemsDto(
      name = items.name,
      amount = items.amount,
      category = items.category,
      price = items.price,
      description = items.description,
      isActive = items.is_active,
      id = items.id!!
    )
  }

  @Transactional(readOnly = true)
  override fun findByPrice(price: BigDecimal): ItemsDto {
    val items = itemsRepository.findByPrice(price)
    return ItemsDto(
      name = items.name,
      amount = items.amount,
      category = items.category,
      price = items.price,
      description = items.description,
      isActive = items.is_active,
      id = items.id!!
    )
  }

  @Transactional(readOnly = true)
  override fun findByDescription(description: String): ItemsDto {
    val items = itemsRepository.findByDescription(description)
    return ItemsDto(
      name = items.name,
      amount = items.amount,
      category = items.category,
      price = items.price,
      description = items.description,
      isActive = items.is_active,
      id = items.id!!
    )
  }

  @Transactional(readOnly = true)
  override fun findByCategory(category: String): ItemsDto {
    val items = itemsRepository.findByCategory(category)
    return ItemsDto(
      name = items.name,
      amount = items.amount,
      category = items.category,
      price = items.price,
      description = items.description,
      isActive = items.is_active,
      id = items.id!!
    )
  }

  @Transactional()
  override fun delete(id: Long) {
    val items = itemsRepository.getOne(id)
    itemsRepository.delete(items)
  }
}