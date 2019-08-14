package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.customer.CreateCustomerDto
import SprintKotlin.KotlindemProject.dto.customer.CustomerDto
import SprintKotlin.KotlindemProject.dto.customer.UpdateCustomerDto
import SprintKotlin.KotlindemProject.repo.CustomerDtoService
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal

@RestController
@RequestMapping("/api/customers")
class CustomerWebController(
  private val customerDtoService: CustomerDtoService
) {

  @PostMapping("/create")
  fun create(@RequestBody createCustomerDto: CreateCustomerDto): CustomerDto =
    customerDtoService.create(
      CreateCustomerDto(
        "billy.bobby@gmail.com",
        "Billy",
        "Bobby",
        89655,
        BigDecimal.valueOf(56.98),
        "Test description",
        "test category"
      )
    )

  @GetMapping("/findById/{id}")
  fun findById(@PathVariable id: Long): CustomerDto {
    return customerDtoService.findById(id)
  }

  @GetMapping("findByLastName/{firstName}")
  fun findByLastName(@PathVariable lastName: String): CustomerDto {
    return customerDtoService.findByLastName(lastName)
  }

  @GetMapping("findByFirstName/{lastName}")
  fun findByFirstName(@PathVariable firstName: String): CustomerDto {
    return customerDtoService.findByFirstName(firstName)
  }

  @GetMapping("findByAmount/{amount}")
  fun findByAmount(@PathVariable amount: Int): CustomerDto {
    return customerDtoService.findByAmount(amount)
  }

  @GetMapping("findByPrice/{price}")
  fun findByPrice(@PathVariable price: BigDecimal): CustomerDto {
    return customerDtoService.findByPrice(price)
  }

  @GetMapping("findByDescription/{description}")
  fun findByDescription(@PathVariable description: String): CustomerDto {
    return customerDtoService.findByDescription(description)
  }

  @GetMapping("findByCategory/{category}")
  fun findByCategory(@PathVariable category: String): CustomerDto {
    return customerDtoService.findByCategory(category)
  }

  @PutMapping("/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody updateCustomerDto: UpdateCustomerDto
  ): CustomerDto =
    customerDtoService.update(updateCustomerDto, id)

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = customerDtoService.delete(id)

}