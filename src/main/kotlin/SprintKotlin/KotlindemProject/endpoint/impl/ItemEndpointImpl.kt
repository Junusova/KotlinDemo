package SprintKotlin.KotlindemProject.endpoint.impl

import SprintKotlin.KotlindemProject.domain.CreateItemRequest
import SprintKotlin.KotlindemProject.domain.UpdateItemRequest
import SprintKotlin.KotlindemProject.dto.items.CreateItemsDto
import SprintKotlin.KotlindemProject.dto.items.ItemsDto
import SprintKotlin.KotlindemProject.dto.items.UpdateItemsDto
import SprintKotlin.KotlindemProject.model.Items
import SprintKotlin.KotlindemProject.service.ItemsService
import SprintKotlin.KotlindemProject.service.requestmapper.CategoryDtoMapperService
import org.springframework.stereotype.Service

interface ItemsRequestMapper {
  fun convertToDto(items: Items): ItemsDto
  fun convertToCreateItemRequest(createItemsDto: CreateItemsDto): CreateItemRequest
  fun convertToDtoUpdateItemRequest(updateItemsDto: UpdateItemsDto): UpdateItemRequest
}

@Service
class ItemEndpointImpl(
  private val categoryDtoMapper: CategoryDtoMapperService,
  private val itemService: ItemsService
) : ItemsRequestMapper {
  override fun convertToDtoUpdateItemRequest(updateItemsDto: UpdateItemsDto): UpdateItemRequest {

  }


  override fun convertToCreateItemRequest(createItemsDto: CreateItemsDto): CreateItemRequest {
    val category = itemService.getById(createItemsDto.category)
    return CreateItemRequest(
      email = createItemsDto.email,
      name = createItemsDto.name,
      amount = createItemsDto.amount,
      price = createItemsDto.price,
      description = createItemsDto.description,
      category = category,
      isActive = true
    )
  }

  override fun convertToDto(items: Items): ItemsDto {
    val category = categoryDtoMapper.convertToDto(items.categories!!)
    return ItemsDto(
      id = items.id!!,
      name = items.name,
      description = items.description,
      amount = items.amount,
      category = category,
      isActive = true,
      price = items.price
    )
  }
}