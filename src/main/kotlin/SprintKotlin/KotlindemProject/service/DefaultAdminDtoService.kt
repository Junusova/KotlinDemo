package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.admin.AdminDto
import SprintKotlin.KotlindemProject.dto.admin.CreateAdminDto
import SprintKotlin.KotlindemProject.dto.admin.UpdateAdminDto
import SprintKotlin.KotlindemProject.model.Admin
import SprintKotlin.KotlindemProject.repo.AdminDtoService
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.util.*


@Service
abstract class DefaultAdminDtoService : AdminDtoService {

  override fun create(createAdminDto: CreateAdminDto): AdminDto {
    return create( CreateAdminDto(
      "brown.smith@gmail.com",
      "Brown",
      "Smith",
      89,
      BigDecimal.valueOf(13.55),
      "Test description",
      "test category"
    ))
  }

  override fun update(updateAdminDto: UpdateAdminDto, id: Long): AdminDto {
    return update(updateAdminDto, id)
  }

  override fun findById(id: Long): Optional<Admin> {
    return findById(id)
  }

  override fun findByLastName(lastName: String): AdminDto {
   return findByLastName(lastName)
  }

  override fun findByFirstName(firstName: String): AdminDto {
    return findByFirstName(firstName)
  }

  override fun findByAmount(amount: Int): AdminDto {
   return  findByAmount(amount)
  }

  override fun findByPrice(price: BigDecimal): AdminDto {
    return findByPrice(price)
  }

  override fun findByDescription(description: String): AdminDto {
    return findByDescription(description)
  }

  override fun findByCategory(category: String): AdminDto {
    return findByCategory(category)
  }

  override fun delete(id: Long) {
   return delete(id)
  }
}