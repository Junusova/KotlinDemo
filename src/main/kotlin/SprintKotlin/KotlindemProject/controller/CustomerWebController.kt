package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.customer.CreateCustomerDto
import SprintKotlin.KotlindemProject.dto.customer.CustomerDto
import SprintKotlin.KotlindemProject.dto.customer.UpdateCustomerDto
import SprintKotlin.KotlindemProject.service.CustomerDtoService
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal


@Configuration
@RestController
@RequestMapping("/api/customers")
class CustomerWebController(private val customerDtoService: CustomerDtoService) {

  @PostMapping("/create")
  fun create(@RequestBody createCustomerDto: CreateCustomerDto): CustomerDto =
    customerDtoService.create(createCustomerDto)

  @GetMapping("/findById/{id}")
  fun findById(@PathVariable id: Long): CustomerDto =
    customerDtoService.findById(id)

  @GetMapping("findByLastName/{firstName}")
  fun findByLastName(@PathVariable lastName: String): CustomerDto =
    customerDtoService.findByLastName(lastName)


  @GetMapping("findByFirstName/{lastName}")
  fun findByFirstName(@PathVariable firstName: String): CustomerDto =
    customerDtoService.findByFirstName(firstName)


  @GetMapping("findByAmount/{amount}")
  fun findByAmount(@PathVariable amount: Int): CustomerDto =
    customerDtoService.findByAmount(amount)


  @GetMapping("findByPrice/{price}")
  fun findByPrice(@PathVariable price: BigDecimal): CustomerDto =
    customerDtoService.findByPrice(price)


  @GetMapping("findByDescription/{description}")
  fun findByDescription(@PathVariable description: String): CustomerDto =
    customerDtoService.findByDescription(description)


  @GetMapping("findByCategory/{category}")
  fun findByCategory(@PathVariable category: String): CustomerDto =
    customerDtoService.findByCategory(category)


  @PutMapping("/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody updateCustomerDto: UpdateCustomerDto
  ): CustomerDto =
    customerDtoService.update(updateCustomerDto, id)

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = customerDtoService.delete(id)

}