package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.items.ItemsDto
import SprintKotlin.KotlindemProject.dto.items.CreateItemsDto
import SprintKotlin.KotlindemProject.dto.items.UpdateItemsDto
import SprintKotlin.KotlindemProject.dtoService.ItemDtoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/items")
class ItemsController(private val itemsDtoService: ItemDtoService) {

  @PostMapping("/create")
  fun create(@RequestBody createItemsDto: CreateItemsDto): ItemsDto =
    itemsDtoService.create(createItemsDto)

  @PutMapping("update/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody updateItemsDto: UpdateItemsDto
  ): ItemsDto =
    itemsDtoService.update(updateItemsDto, id)

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = itemsDtoService.delete(id)

}

