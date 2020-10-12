package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.items.ItemsDto
import SprintKotlin.KotlindemProject.dto.items.CreateItemsDto
import SprintKotlin.KotlindemProject.dto.items.UpdateItemsDto
import SprintKotlin.KotlindemProject.dtoService.ItemDtoService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/items")
@Api(value = "Items")

class ItemsController(private val itemsDtoService: ItemDtoService) {


  @ApiOperation(value = "Create Item")
  @ApiResponse(code = 200,
               message = "OK")
  @PostMapping("/create")
  fun create(@RequestBody createItemsDto: CreateItemsDto): ItemsDto =
    itemsDtoService.create(createItemsDto)


  @ApiOperation(value = "Update Item")
  @ApiResponse(code = 200,
               message = "OK")
  @PutMapping("update/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody updateItemsDto: UpdateItemsDto
  ): ItemsDto =
    itemsDtoService.update(updateItemsDto, id)


  @ApiOperation(value = "Delete Item By Id")
  @ApiResponse(code = 200,
               message = "OK")
  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = itemsDtoService.delete(id)

}

