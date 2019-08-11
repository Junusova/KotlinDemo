package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.model.SecurityTeam
import SprintKotlin.KotlindemProject.repo.SecurityTeamRepository
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal


@RestController
@RequestMapping("/api/guards")
class SecurityTeamWebController (

  private val repository: SecurityTeamRepository
) {

  @PostMapping("/save")
  fun save(): String {
    repository.save(SecurityTeam("Jack", "Smith", 15, BigDecimal.valueOf(15.63),  "Test description", "test category"))
    return "Done"
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
    @RequestBody securityTeam: SecurityTeam
  )
  {
    repository.save(securityTeam)
  }

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long)
  {
    repository.deleteById(id)
  }
}