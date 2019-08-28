package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.guard.CreateGuardDto
import SprintKotlin.KotlindemProject.dto.guard.GuardDto
import SprintKotlin.KotlindemProject.dto.guard.UpdateGuardDto
import SprintKotlin.KotlindemProject.model.Admin
import SprintKotlin.KotlindemProject.repo.GuardDtoService
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.util.*

@Service
abstract class DefaultGuardDtoService : GuardDtoService {

  override fun create(createGuardDto: CreateGuardDto): GuardDto {
    return create(
      CreateGuardDto(
        "brown.smith@gmail.com",
        "Brown",
        "Smith",
        89,
        BigDecimal.valueOf(13.55),
        "Test description",
        "test category"
      )
    )
  }

  override fun update(updateGuardDto: UpdateGuardDto, id: Long): GuardDto {
    return update(updateGuardDto, id)
  }

  override fun findById(id: Long): Optional<Admin> {
    return findById(id)
  }

  override fun findByLastName(lastName: String): GuardDto {
    return findByLastName(lastName)
  }

  override fun findByFirstName(firstName: String): GuardDto {
    return findByFirstName(firstName)
  }

  override fun findByAmount(amount: Int): GuardDto {
    return findByAmount(amount)
  }

  override fun findByPrice(price: BigDecimal): GuardDto {
    return findByPrice(price)
  }

  override fun findByDescription(description: String): GuardDto {
    return findByDescription(description)
  }

  override fun findByCategory(category: String): GuardDto {
    return findByCategory(category)
  }

  override fun delete(id: Long) {
    return delete(id)
  }
}
