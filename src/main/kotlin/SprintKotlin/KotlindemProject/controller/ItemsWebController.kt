package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.items.ItemsDto
import SprintKotlin.KotlindemProject.dto.items.CreateItemsDto
import SprintKotlin.KotlindemProject.dto.items.UpdateItemsDto
import SprintKotlin.KotlindemProject.service.ItemsDtoService
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal

@RestController
@RequestMapping("/api/items")
class ItemsWebController(private val adminRepository: ItemsDtoService) {

  @PostMapping("/create")
  fun create(@RequestBody createItemsDto: CreateItemsDto): ItemsDto =
      adminRepository.create(createItemsDto)

  @GetMapping("/findById/{id}")
  fun findById(@PathVariable id: Long): ItemsDto =
    adminRepository.findById(id)

  @GetMapping("/findByName/{name}")
  fun findByName(@PathVariable name: String): ItemsDto =
   adminRepository.findByName(name)

  @GetMapping("/findByAmount/{amount}")
  fun findByAmount(@PathVariable amount: Int): ItemsDto =
    adminRepository.findByAmount(amount)

  @GetMapping("/findByPrice/{price}")
  fun findByPrice(@PathVariable price: BigDecimal): ItemsDto =
     adminRepository.findByPrice(price)

  @GetMapping("/findByDescription/{description}")
  fun findByDescription(@PathVariable description: String): ItemsDto =
     adminRepository.findByDescription(description)

  @GetMapping("/findByCategory/{category}")
  fun findByCategory(@PathVariable category: Long): ItemsDto =
     adminRepository.findByCategory(category)


  @PutMapping("update/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody updateItemsDto: UpdateItemsDto): ItemsDto =
    adminRepository.update(updateItemsDto, id)

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = adminRepository.delete(id)

}

