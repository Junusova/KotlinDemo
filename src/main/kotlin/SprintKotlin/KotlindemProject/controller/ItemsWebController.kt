package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.items.ItemsDto
import SprintKotlin.KotlindemProject.dto.items.CreateItemsDto
import SprintKotlin.KotlindemProject.dto.items.UpdateItemsDto
import SprintKotlin.KotlindemProject.service.ItemDtoService
import SprintKotlin.KotlindemProject.service.ItemsService
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal

@RestController
@RequestMapping("/api/items")
class ItemsWebController(private val itemsDtoService: ItemDtoService) {

  @PostMapping("/create")
  fun create(@RequestBody createItemsDto: CreateItemsDto): ItemsDto =
      itemsDtoService.create(createItemsDto)

//  @GetMapping("/findById/{id}")
//  fun findById(@PathVariable id: Long): ItemsDto =
//    itemsDtoService.findById(id)
//
//  @GetMapping("/findByName/{name}")
//  fun findByName(@PathVariable name: String): ItemsDto =
//   itemsService.findByName(name)
//
//  @GetMapping("/findByAmount/{amount}")
//  fun findByAmount(@PathVariable amount: Int): ItemsDto =
//    itemsService.findByAmount(amount)
//
//  @GetMapping("/findByPrice/{price}")
//  fun findByPrice(@PathVariable price: BigDecimal): ItemsDto =
//     itemsService.findByPrice(price)
//
//  @GetMapping("/findByDescription/{description}")
//  fun findByDescription(@PathVariable description: String): ItemsDto =
//     itemsService.findByDescription(description)
//
//  @GetMapping("/findByCategory/{categoryId}")
//  fun findByCategory(@PathVariable category: Long): ItemsDto =
//     itemsService.findByCategory(category)


  @PutMapping("update/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody updateItemsDto: UpdateItemsDto): ItemsDto =
    itemsDtoService.update(updateItemsDto, id)

//  @DeleteMapping("/{id}")
//  fun delete(@PathVariable id: Long) = itemsService.delete(id)

}

