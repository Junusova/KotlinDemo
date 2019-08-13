package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.model.Customer
import SprintKotlin.KotlindemProject.repo.CustomerRepository
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal

@RestController
@RequestMapping("/api/customers")
class CustomerWebController(
  private val repository: CustomerRepository
) {

  @PostMapping("/save")
  fun save(): String {
    repository.save(Customer("Jack", "Smith", 15, BigDecimal.valueOf(15.63),  "Test description", "test category"))
    repository.save(Customer("Adam", "Johnson", 5, BigDecimal.valueOf(11.63),  "Test description", "test category"))
    repository.save(Customer("Kim", "Smith", 89, BigDecimal.valueOf(13.55),  "Test description", "test category"))
    repository.save(Customer("David", "Williams", 85, BigDecimal.valueOf(55.11),  "Test description", "test category"))
    repository.save(Customer("Peter", "Davis", 15, BigDecimal.valueOf(44.56),  "Test description", "test category"))

    return "Customer was successfully created"
  }


  @PutMapping("/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody customer: Customer)
  {
    repository.save(customer)
  }


  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long)
  {
    repository.deleteById(id)
  }

  @GetMapping("/findAll")
  fun findAll() = repository.findAll()

  @GetMapping("/findById/{id}")
  fun findById(@PathVariable id: Long)
      = repository.findById(id)

  @GetMapping("findByLastName/{firstName}")
  fun findByLastName(@PathVariable lastName: String)
      = repository.findByLastName(lastName)

  @GetMapping("findByFirstName/{lastName}")
  fun findByFirstName(@PathVariable firstName: String)
      = repository.findByFirstName(firstName)

  @GetMapping("findByAmount/{amount}")
  fun  findByAmount(@PathVariable amount: Int)
      = repository.findByAmount(amount)

  @GetMapping("findByPrice/{price}")
  fun  findByPrice(@PathVariable price: BigDecimal)
      = repository.findByPrice(price)

  @GetMapping("findByDescription/{description}")
  fun  findByDescription(@PathVariable description: String)
      = repository.findByDescription(description)

  @GetMapping("findByCategory/{category}")
  fun  findByCategory(@PathVariable category: String)
      = repository.findByCategory(category)
}