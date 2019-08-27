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
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findById(id: Long): AdminDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findByLastName(lastName: String): AdminDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findByFirstName(firstName: String): AdminDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findByAmount(amount: Int): AdminDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findByPrice(price: BigDecimal): AdminDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findByDescription(description: String): AdminDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findByCategory(category: String): AdminDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun delete(id: Long) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}