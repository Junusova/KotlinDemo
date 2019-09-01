package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.lender.CreateLenderDto
import SprintKotlin.KotlindemProject.dto.lender.LenderDto
import SprintKotlin.KotlindemProject.dto.lender.UpdateLenderDto
import SprintKotlin.KotlindemProject.service.LenderDtoService
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal

@RestController
@RequestMapping("/api/lenders")
class LenderWebController(private val lenderDtoService: LenderDtoService) {

  @PostMapping("/create")
  fun create(@RequestBody createLenderDto: CreateLenderDto): LenderDto =
    lenderDtoService.create(createLenderDto)

  @GetMapping("/findById/{id}")
  fun findById(@PathVariable id: Long): LenderDto =
    lenderDtoService.findById(id)

  @GetMapping("findByLastName/{firstName}")
  fun findByLastName(@PathVariable lastName: String): LenderDto =
    lenderDtoService.findByLastName(lastName)

  @GetMapping("findByFirstName/{lastName}")
  fun findByFirstName(@PathVariable firstName: String): LenderDto =
    lenderDtoService.findByFirstName(firstName)


  @GetMapping("findByAmount/{amount}")
  fun findByAmount(@PathVariable amount: Int): LenderDto =
    lenderDtoService.findByAmount(amount)

  @GetMapping("findByPrice/{price}")
  fun findByPrice(@PathVariable price: BigDecimal): LenderDto =
    lenderDtoService.findByPrice(price)

  @GetMapping("findByDescription/{description}")
  fun findByDescription(@PathVariable description: String): LenderDto =
    lenderDtoService.findByDescription(description)

  @GetMapping("findByCategory/{category}")
  fun findByCategory(@PathVariable category: String): LenderDto =
    lenderDtoService.findByCategory(category)

  @PutMapping("/{id}")
  fun update(@PathVariable id: Long, @RequestBody updateLenderDto: UpdateLenderDto): LenderDto =
    lenderDtoService.update(updateLenderDto, id)

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = lenderDtoService.delete(id)
}