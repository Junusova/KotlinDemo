package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.lender.CreateLenderDto
import SprintKotlin.KotlindemProject.dto.lender.LenderDto
import SprintKotlin.KotlindemProject.dto.lender.UpdateLenderDto
import SprintKotlin.KotlindemProject.repo.LenderDtoService
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal

@RestController
@RequestMapping("/api/lenders")
class LenderWebController(
  private val lenderDtoService: LenderDtoService
) {

  @PostMapping("/create")
  fun create(@RequestBody createLenderDto: CreateLenderDto): LenderDto =
    lenderDtoService.create(
      CreateLenderDto(
        "sam.jackson@gmail.com",
        "Sam",
        "Jackson",
        1000,
        BigDecimal.valueOf(96.98),
        "Test description",
        "test category"
      )
    )

  @GetMapping("/findById/{id}")
  fun findById(@PathVariable id: Long): LenderDto {
    return lenderDtoService.findById(id)
  }

  @GetMapping("findByLastName/{firstName}")
  fun findByLastName(@PathVariable lastName: String): LenderDto {
    return lenderDtoService.findByLastName(lastName)
  }

  @GetMapping("findByFirstName/{lastName}")
  fun findByFirstName(@PathVariable firstName: String): LenderDto {
    return lenderDtoService.findByFirstName(firstName)
  }

  @GetMapping("findByAmount/{amount}")
  fun findByAmount(@PathVariable amount: Int): LenderDto {
    return lenderDtoService.findByAmount(amount)
  }

  @GetMapping("findByPrice/{price}")
  fun findByPrice(@PathVariable price: BigDecimal): LenderDto {
    return lenderDtoService.findByPrice(price)
  }

  @GetMapping("findByDescription/{description}")
  fun findByDescription(@PathVariable description: String): LenderDto {
    return lenderDtoService.findByDescription(description)
  }

  @GetMapping("findByCategory/{category}")
  fun findByCategory(@PathVariable category: String): LenderDto {
    return lenderDtoService.findByCategory(category)
  }

  @PutMapping("/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody updateLenderDto: UpdateLenderDto
  ): LenderDto =
    lenderDtoService.update(updateLenderDto, id)

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = lenderDtoService.delete(id)
}