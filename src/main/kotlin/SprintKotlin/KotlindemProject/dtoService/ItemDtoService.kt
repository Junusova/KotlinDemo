package SprintKotlin.KotlindemProject.dtoService

import SprintKotlin.KotlindemProject.dto.items.CreateItemsDto
import SprintKotlin.KotlindemProject.dto.items.ItemsDto
import SprintKotlin.KotlindemProject.dto.items.UpdateItemsDto
import SprintKotlin.KotlindemProject.model.Items

interface ItemDtoService {
  fun create(createItemsDto: CreateItemsDto): ItemsDto
  fun update(updateItemsDto: UpdateItemsDto, id: Long): ItemsDto
  fun findBy(id: Long): Items
  fun delete(id: Long)
}