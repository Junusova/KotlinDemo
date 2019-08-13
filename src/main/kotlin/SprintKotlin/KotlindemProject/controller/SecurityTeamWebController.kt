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
    return "Guadrs were created successfully"
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