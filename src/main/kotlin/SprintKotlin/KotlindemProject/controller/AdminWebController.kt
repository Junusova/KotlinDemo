package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.model.Admin
import SprintKotlin.KotlindemProject.repo.AdminRepository
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal


@RestController
@RequestMapping("/api/admin")
class AdminWebController (
  private val repository: AdminRepository
  ) {

    @PostMapping("/save")
    fun save(): String {
      repository.save(Admin("Brandon", "Kate", 15, BigDecimal.valueOf(15.63),  "Test description", "test category"))
      repository.save(Admin("Milly", "Johnson", 5, BigDecimal.valueOf(11.63),  "Test description", "test category"))
      repository.save(Admin("Brown", "Smith", 89, BigDecimal.valueOf(13.55),  "Test description", "test category"))
      repository.save(Admin("Max", "Allan", 85, BigDecimal.valueOf(55.11),  "Test description", "test category"))
      repository.save(Admin("Jimmy", "Fallon", 15, BigDecimal.valueOf(44.56),  "Test description", "test category"))

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
  }