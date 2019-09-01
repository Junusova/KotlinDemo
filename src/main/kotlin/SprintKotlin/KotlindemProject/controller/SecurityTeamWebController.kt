package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.guard.CreateGuardDto
import SprintKotlin.KotlindemProject.dto.guard.GuardDto
import SprintKotlin.KotlindemProject.dto.guard.UpdateGuardDto
import SprintKotlin.KotlindemProject.service.GuardDtoService
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal

@RestController
@RequestMapping("/api/guards")
class SecurityTeamWebController(private val guardDtoService: GuardDtoService) {

  @PostMapping("/create")
  fun create(@RequestBody createGuardDto: CreateGuardDto): GuardDto =
    guardDtoService.create(createGuardDto)

  @GetMapping("/findById/{id}")
  fun findById(@PathVariable id: Long): GuardDto =
    guardDtoService.findById(id)


  @GetMapping("findByLastName/{firstName}")
  fun findByLastName(@PathVariable lastName: String): GuardDto =
    guardDtoService.findByLastName(lastName)


  @GetMapping("findByFirstName/{lastName}")
  fun findByFirstName(@PathVariable firstName: String): GuardDto =
    guardDtoService.findByFirstName(firstName)


  @GetMapping("findByAmount/{amount}")
  fun findByAmount(@PathVariable amount: Int): GuardDto =
    guardDtoService.findByAmount(amount)


  @GetMapping("findByPrice/{price}")
  fun findByPrice(@PathVariable price: BigDecimal): GuardDto =
    guardDtoService.findByPrice(price)

  @GetMapping("findByDescription/{description}")
  fun findByDescription(@PathVariable description: String): GuardDto =
    guardDtoService.findByDescription(description)

  @GetMapping("findByCategory/{category}")
  fun findByCategory(@PathVariable category: String): GuardDto =
    guardDtoService.findByCategory(category)


  @PutMapping("/{id}")
  fun update(@PathVariable id: Long, @RequestBody updateGuardDto: UpdateGuardDto): GuardDto =
    guardDtoService.update(updateGuardDto, id)

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = guardDtoService.delete(id)
}