package SprintKotlin.KotlindemProject.service.requestmapper

import SprintKotlin.KotlindemProject.domain.CreateItemRequest
import SprintKotlin.KotlindemProject.dto.items.CreateItemsDto
import SprintKotlin.KotlindemProject.model.Items
import org.springframework.stereotype.Service

interface ItemsRequestMapper {

  fun createItemConvertor(createItemsDto: CreateItemsDto): CreateItemRequest
}
//
//@Service
//class DefaultItemsRequestMapper: ItemsRequestMapper {
//
//  override fun createItemConvertor(createItemsDto: CreateItemsDto): Items=
//      Items(
//        name = CreateItemsDto
//      )
//}