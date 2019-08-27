package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.admin.AdminDto
import SprintKotlin.KotlindemProject.dto.admin.CreateAdminDto
import SprintKotlin.KotlindemProject.dto.admin.UpdateAdminDto
import SprintKotlin.KotlindemProject.repo.AdminDtoService
import org.springframework.stereotype.Service
import java.math.BigDecimal


@Service
class DefaultAdminDtoService (
  private val adminService: AdminDtoService
): AdminDtoService {

  override fun create(createAdminDto: CreateAdminDto): AdminDto {
    return adminService.create(createAdminDto)
  }

  override fun update(updateAdminDto: UpdateAdminDto, id: Long): AdminDto {
    return adminService.update(updateAdminDto, id)
  }

  override fun findById(id: Long): AdminDto {
    return adminService.findById(id)
  }

  override fun findByLastName(lastName: String): AdminDto {
   return adminService.findByLastName(lastName)
  }

  override fun findByFirstName(firstName: String): AdminDto {
    return adminService.findByFirstName(firstName)
  }

  override fun findByAmount(amount: Int): AdminDto {
   return  adminService.findByAmount(amount)
  }

  override fun findByPrice(price: BigDecimal): AdminDto {
    return adminService.findByPrice(price)
  }

  override fun findByDescription(description: String): AdminDto {
    return adminService.findByDescription(description)
  }

  override fun findByCategory(category: String): AdminDto {
    return adminService.findByCategory(category)
  }

  override fun delete(id: Long) {
   return adminService.delete(id)
  }
}