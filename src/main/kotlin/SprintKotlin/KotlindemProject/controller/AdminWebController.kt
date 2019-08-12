package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.model.Admin
import SprintKotlin.KotlindemProject.repo.AdminRepository
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal


@RestController
@RequestMapping("/api/admin")
class AdminWebController (
  private val repository: AdminRepository
  ) {

    @PostMapping("/save")
    fun save(): String {
      repository.save(Admin("Brown", "Smith", 89, BigDecimal.valueOf(13.55),  "Test description", "test category"))
      repository.save(Admin("Max", "Allan", 85, BigDecimal.valueOf(55.11),  "Test description", "test category"))
      repository.save(Admin("Jimmy", "Fallon", 15, BigDecimal.valueOf(44.56),  "Test description", "test category"))

      return "Admins was created successfully"
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
    @RequestBody admin: Admin
  )
  {
    repository.save(admin)
  }


  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long): String {
    repository.deleteById(id)
    return "Admin deleted  successfully"
  }
  }