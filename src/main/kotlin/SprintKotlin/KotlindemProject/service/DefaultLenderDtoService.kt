package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.lender.LenderDto
import SprintKotlin.KotlindemProject.dto.lender.CreateLenderDto
import SprintKotlin.KotlindemProject.dto.lender.UpdateLenderDto
import SprintKotlin.KotlindemProject.repo.LenderDtoService
import org.springframework.stereotype.Service
import java.math.BigDecimal


@Service
class DefaultLenderDtoService (
  private val lenderService: LenderDtoService
): LenderDtoService {

  override fun create(createLenderDto: CreateLenderDto): LenderDto {
    return lenderService.create(createLenderDto)
  }

  override fun update(updateLenderDto: UpdateLenderDto, id: Long): LenderDto {
    return lenderService.update(updateLenderDto, id)
  }

  override fun findById(id: Long): LenderDto {
    return lenderService.findById(id)
  }

  override fun findByLastName(lastName: String): LenderDto {
    return lenderService.findByLastName(lastName)
  }

  override fun findByFirstName(firstName: String): LenderDto {
    return lenderService.findByFirstName(firstName)
  }

  override fun findByAmount(amount: Int): LenderDto {
    return  lenderService.findByAmount(amount)
  }

  override fun findByPrice(price: BigDecimal): LenderDto {
    return lenderService.findByPrice(price)
  }

  override fun findByDescription(description: String): LenderDto {
    return lenderService.findByDescription(description)
  }

  override fun findByCategory(category: String): LenderDto {
    return lenderService.findByCategory(category)
  }

  override fun delete(id: Long) {
    return lenderService.delete(id)
  }
}