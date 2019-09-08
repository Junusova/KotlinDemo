package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.items.CreateItemsDto
import SprintKotlin.KotlindemProject.dto.items.ItemsDto
import SprintKotlin.KotlindemProject.dto.items.UpdateItemsDto

interface ItemDtoService {
  fun create(createItemsDto: CreateItemsDto): ItemsDto
  fun update(updateItemsDto: UpdateItemsDto, id: Long): ItemsDto
}