package SprintKotlin.KotlindemProject.endpoint

import SprintKotlin.KotlindemProject.dto.items.CreateItemsDto
import SprintKotlin.KotlindemProject.dto.items.ItemsDto

interface ItemEndpoint {
  fun create(createItemsDto: CreateItemsDto): ItemsDto
}

