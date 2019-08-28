package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.admin.AdminDto
import SprintKotlin.KotlindemProject.dto.admin.CreateAdminDto
import SprintKotlin.KotlindemProject.dto.admin.UpdateAdminDto
import SprintKotlin.KotlindemProject.model.Admin
import SprintKotlin.KotlindemProject.repo.AdminRepository
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal
import java.util.*


@RestController
@RequestMapping("/api/admin")
class AdminWebController(
  private val adminRepository: AdminRepository
) {

  @PostMapping("/create")
  fun create(@RequestBody createAdminDto: CreateAdminDto): AdminDto =
    adminRepository.create(createAdminDto)

  @GetMapping("/findById/{id}")
  fun findById(@PathVariable id: Long): AdminDto {
    return adminRepository.findById(id)
  }

  @GetMapping("findByLastName/{firstName}")
  fun findByLastName(@PathVariable lastName: String): AdminDto {
    return adminRepository.findByLastName(lastName)
  }

  @GetMapping("findByFirstName/{lastName}")
  fun findByFirstName(@PathVariable firstName: String): AdminDto {
    return adminRepository.findByFirstName(firstName)
  }

  @GetMapping("findByAmount/{amount}")
  fun findByAmount(@PathVariable amount: Int): AdminDto {
    return adminRepository.findByAmount(amount)
  }

  @GetMapping("findByPrice/{price}")
  fun findByPrice(@PathVariable price: BigDecimal): AdminDto {
    return adminRepository.findByPrice(price)
  }

  @GetMapping("findByDescription/{description}")
  fun findByDescription(@PathVariable description: String): AdminDto {
    return adminRepository.findByDescription(description)
  }

  @GetMapping("findByCategory/{category}")
  fun findByCategory(@PathVariable category: String): AdminDto {
    return adminRepository.findByCategory(category)
  }


  @PutMapping("/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody updateAdminDto: UpdateAdminDto
  ): AdminDto =
    adminRepository.update(updateAdminDto, id)

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = adminRepository.delete(id)

}

