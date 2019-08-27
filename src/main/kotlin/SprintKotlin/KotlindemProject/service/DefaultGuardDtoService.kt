package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.guard.CreateGuardDto
import SprintKotlin.KotlindemProject.dto.guard.GuardDto
import SprintKotlin.KotlindemProject.dto.guard.UpdateGuardDto
import SprintKotlin.KotlindemProject.repo.GuardDtoService
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class DefaultGuardDtoService (

  private val guardService: GuardDtoService
  ): GuardDtoService {

  override fun create(createGuardDto: CreateGuardDto): GuardDto {
    return guardService.create(createGuardDto)
  }

  override fun update(updateGuardDto: UpdateGuardDto, id: Long): GuardDto {
    return guardService.update(updateGuardDto, id)
  }

  override fun findById(id: Long): GuardDto {
    return guardService.findById(id)
  }

  override fun findByLastName(lastName: String): GuardDto {
    return guardService.findByLastName(lastName)
  }

  override fun findByFirstName(firstName: String): GuardDto {
    return guardService.findByFirstName(firstName)
  }

  override fun findByAmount(amount: Int): GuardDto {
    return guardService.findByAmount(amount)
  }

  override fun findByPrice(price: BigDecimal): GuardDto {
    return guardService.findByPrice(price)
  }

  override fun findByDescription(description: String): GuardDto {
    return guardService.findByDescription(description)
  }

  override fun findByCategory(category: String): GuardDto {
    return guardService.findByCategory(category)
  }

  override fun delete(id: Long) {
    return guardService.delete(id)
  }
}
