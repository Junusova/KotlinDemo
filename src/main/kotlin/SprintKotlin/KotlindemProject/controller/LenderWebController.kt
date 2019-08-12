package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.model.Lender
import SprintKotlin.KotlindemProject.repo.LenderRepository
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal


@RestController
@RequestMapping("/api/lenders")
class LenderWebController(
  private val repository: LenderRepository
) {

  @PostMapping("/save")
  fun save(): String {
    repository.save(Lender("Jack", "Smith", 15, BigDecimal.valueOf(15.63),  "Test description", "test category"))
    return "Lenders were created successfully"
  }

  @RequestMapping("/findAll")
  fun findAll() = repository.findAll()

  @RequestMapping("/findById/{id}")
  fun findById(@PathVariable id: Long)
      = repository.findById(id)

  @RequestMapping("findByLastName/{firstName}")
  fun findByLastName(@PathVariable lastName: String)
      = repository.findByLastName(lastName)

  @RequestMapping("findByFirstName/{lastName}")
  fun findByFirstName(@PathVariable firstName: String)
      = repository.findByFirstName(firstName)

  @RequestMapping("findByAmount/{amount}")
  fun  findByAmount(@PathVariable amount: Int)
      = repository.findByAmount(amount)

  @RequestMapping("findByPrice/{price}")
  fun  findByPrice(@PathVariable price: BigDecimal)
      = repository.findByPrice(price)

  @RequestMapping("findByDescription/{description}")
  fun  findByDescription(@PathVariable description: String)
      = repository.findByDescription(description)

  @RequestMapping("findByCategory/{category}")
  fun  findByCategory(@PathVariable category: String)
      = repository.findByCategory(category)


  @PutMapping("/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody lender: Lender
  )
  {
    repository.save(lender)
  }


  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long)
  {
    repository.deleteById(id)
  }
}