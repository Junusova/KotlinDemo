package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.admin.AdminDto
import SprintKotlin.KotlindemProject.dto.admin.CreateAdminDto
import SprintKotlin.KotlindemProject.dto.admin.UpdateAdminDto
import SprintKotlin.KotlindemProject.service.AdminDtoService
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal


@RestController
@RequestMapping("/api/admin")
class AdminWebController(private val adminRepository: AdminDtoService) {

  @PostMapping("/create")
  fun create(@RequestBody createAdminDto: CreateAdminDto): AdminDto =
      adminRepository.create(createAdminDto)


  @GetMapping("/findById/{id}")
  fun findById(@PathVariable id: Long): AdminDto =
    adminRepository.findById(id)


  @GetMapping("findByLastName/{firstName}")
  fun findByLastName(@PathVariable lastName: String): AdminDto =
   adminRepository.findByLastName(lastName)


  @GetMapping("findByFirstName/{lastName}")
  fun findByFirstName(@PathVariable firstName: String): AdminDto =
    adminRepository.findByFirstName(firstName)


  @GetMapping("findByAmount/{amount}")
  fun findByAmount(@PathVariable amount: Int): AdminDto =
    adminRepository.findByAmount(amount)

  @GetMapping("findByPrice/{price}")
  fun findByPrice(@PathVariable price: BigDecimal): AdminDto =
     adminRepository.findByPrice(price)

  @GetMapping("findByDescription/{description}")
  fun findByDescription(@PathVariable description: String): AdminDto =
     adminRepository.findByDescription(description)

  @GetMapping("findByCategory/{category}")
  fun findByCategory(@PathVariable category: String): AdminDto =
     adminRepository.findByCategory(category)


  @PutMapping("/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody updateAdminDto: UpdateAdminDto): AdminDto =
    adminRepository.update(updateAdminDto, id)

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = adminRepository.delete(id)

}

