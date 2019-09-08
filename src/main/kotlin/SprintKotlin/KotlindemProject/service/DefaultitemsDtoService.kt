package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.domain.CreateItemRequest
import SprintKotlin.KotlindemProject.domain.UpdateItemRequest
import SprintKotlin.KotlindemProject.dto.category.CreateCategoryDto
import SprintKotlin.KotlindemProject.dto.items.CreateItemsDto
import SprintKotlin.KotlindemProject.dto.items.ItemsDto
import SprintKotlin.KotlindemProject.dto.items.UpdateItemsDto
import SprintKotlin.KotlindemProject.endpoint.impl.ItemsRequestMapper
import SprintKotlin.KotlindemProject.model.Category
import SprintKotlin.KotlindemProject.model.Items
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.math.BigDecimal

@Service
class DefaultItemsService(

  private val itemRequestMapper: ItemsRequestMapper,
  private val itemsService: ItemsService,
  private val itemsDtoMapper: ItemsRequestMapper
) : ItemDtoService {


  @Transactional
  override fun create(createItemsDto: CreateItemsDto): ItemsDto {
    val createItemRequest: CreateItemRequest =
      itemRequestMapper.convertToCreateItemRequest(createItemsDto)

    val createItem: Items = itemsService.create(createItemRequest)

    return itemsDtoMapper.convertToDto(createItem)

  }


  @Transactional
  override fun update(updateItemsDto: UpdateItemsDto, id: Long): ItemsDto {
    val updateItemRequest: UpdateItemRequest =
        itemRequestMapper.convertToCreateItemRequest()

  }

//
//  @Transactional
//  override fun update(updateItemsDto: UpdateItemsDto, id: Long): ItemsDto {
//    val items = CreateItemRequest(
//      name = updateItemsDto.name,
//      amount = updateItemsDto.amount,
//      category = updateItemsDto.category,
//      price = updateItemsDto.price,
//      description = updateItemsDto.description,
//      email = updateItemsDto.email
//    )
//
//    return ItemsDto(
//      name = items.name,
//      amount = items.amount,
//      category = items.category,
//      price = items.price,
//      description = items.description,
//      isActive = items.is_active,
//      id = items.id!!
//    )
//  }
//
//  @Transactional(readOnly = true)
//  override fun findById(id: Long): ItemsDto {
//    val items = itemsRepository.getOne(id)
//    return ItemsDto(
//      name = items.name,
//      amount = items.amount,
//      category = items.category,
//      price = items.price,
//      description = items.description,
//      isActive = items.is_active,
//      id = items.id!!
//    )
//  }
//
//
//  @Transactional(readOnly = true)
//  override fun findByName(name: String): ItemsDto {
//    val items = itemsRepository.findByName(name)
//    return ItemsDto(
//      name = items.name,
//      amount = items.amount,
//      category = items.category,
//      price = items.price,
//      description = items.description,
//      isActive = items.is_active,
//      id = items.id!!
//    )
//  }
//
//  @Transactional(readOnly = true)
//  override fun findByAmount(amount: Int): ItemsDto {
//    val items = itemsRepository.findByAmount(amount)
//    return ItemsDto(
//      name = items.name,
//      amount = items.amount,
//      category = items.category,
//      price = items.price,
//      description = items.description,
//      isActive = items.is_active,
//      id = items.id!!
//    )
//  }
//
//  @Transactional(readOnly = true)
//  override fun findByPrice(price: BigDecimal): ItemsDto {
//    val items = itemsRepository.findByPrice(price)
//    return ItemsDto(
//      name = items.name,
//      amount = items.amount,
//      category = items.category,
//      price = items.price,
//      description = items.description,
//      isActive = items.is_active,
//      id = items.id!!
//    )
//  }
//
//  @Transactional(readOnly = true)
//  override fun findByDescription(description: String): ItemsDto {
//    val items = itemsRepository.findByDescription(description)
//    return ItemsDto(
//      name = items.name,
//      amount = items.amount,
//      category = items.category,
//      price = items.price,
//      description = items.description,
//      isActive = items.is_active,
//      id = items.id!!
//    )
//  }
//
//  @Transactional(readOnly = true)
//  override fun findByCategory(category: String): ItemsDto {
//    val items = itemsRepository.findByCategory(category)
//    return ItemsDto(
//      name = items.name,
//      amount = items.amount,
//      category = items.category,
//      price = items.price,
//      description = items.description,
//      isActive = items.is_active,
//      id = items.id!!
//    )
//  }
//
//  @Transactional()
//  override fun delete(id: Long) {
//    val items = itemsRepository.getOne(id)
//    itemsRepository.delete(items)
//  }


  }
