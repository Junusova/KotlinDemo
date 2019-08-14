package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.admin.AdminDto
import SprintKotlin.KotlindemProject.dto.admin.CreateAdminDto
import SprintKotlin.KotlindemProject.dto.admin.UpdateAdminDto
import SprintKotlin.KotlindemProject.repo.AdminDtoService
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal


@RestController
@RequestMapping("/api/admin")
class AdminWebController(
  private val adminDtoService: AdminDtoService
) {

  @PostMapping("/create")
  fun create(@RequestBody createAdminDto: CreateAdminDto): AdminDto =
    adminDtoService.create(
      CreateAdminDto(
        "brown.smith@gmail.com",
        "Brown",
        "Smith",
        89,
        BigDecimal.valueOf(13.55),
        "Test description",
        "test category"
      )
    )

  @GetMapping("/findById/{id}")
  fun findById(@PathVariable id: Long): AdminDto {
    return adminDtoService.findById(id)
  }

  @GetMapping("findByLastName/{firstName}")
  fun findByLastName(@PathVariable lastName: String): AdminDto {
    return adminDtoService.findByLastName(lastName)
  }

  @GetMapping("findByFirstName/{lastName}")
  fun findByFirstName(@PathVariable firstName: String): AdminDto {
    return adminDtoService.findByFirstName(firstName)
  }

  @GetMapping("findByAmount/{amount}")
  fun findByAmount(@PathVariable amount: Int): AdminDto {
    return adminDtoService.findByAmount(amount)
  }

  @GetMapping("findByPrice/{price}")
  fun findByPrice(@PathVariable price: BigDecimal): AdminDto {
    return adminDtoService.findByPrice(price)
  }

  @GetMapping("findByDescription/{description}")
  fun findByDescription(@PathVariable description: String): AdminDto {
    return adminDtoService.findByDescription(description)
  }

  @GetMapping("findByCategory/{category}")
  fun findByCategory(@PathVariable category: String): AdminDto {
    return adminDtoService.findByCategory(category)
  }


  @PutMapping("/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody updateAdminDto: UpdateAdminDto
  ): AdminDto =
    adminDtoService.update(updateAdminDto, id)

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = adminDtoService.delete(id)

}

