package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.lender.LenderDto
import SprintKotlin.KotlindemProject.dto.lender.CreateLenderDto
import SprintKotlin.KotlindemProject.dto.lender.UpdateLenderDto
import SprintKotlin.KotlindemProject.model.Admin
import SprintKotlin.KotlindemProject.repo.LenderDtoService
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.util.*


@Service
abstract class DefaultLenderDtoService : LenderDtoService {

  override fun create(createLenderDto: CreateLenderDto): LenderDto {
    return create(
      CreateLenderDto(
        "sam.jackson@gmail.com",
        "Sam",
        "Jackson",
        1000,
        BigDecimal.valueOf(96.98),
        "Test description",
        "test category"
      )
    )
  }

  override fun update(updateLenderDto: UpdateLenderDto, id: Long): LenderDto {
    return update(updateLenderDto, id)
  }

  override fun findById(id: Long): Optional<Admin> {
    return findById(id)
  }

  override fun findByLastName(lastName: String): LenderDto {
    return findByLastName(lastName)
  }

  override fun findByFirstName(firstName: String): LenderDto {
    return findByFirstName(firstName)
  }

  override fun findByAmount(amount: Int): LenderDto {
    return  findByAmount(amount)
  }

  override fun findByPrice(price: BigDecimal): LenderDto {
    return findByPrice(price)
  }

  override fun findByDescription(description: String): LenderDto {
    return findByDescription(description)
  }

  override fun findByCategory(category: String): LenderDto {
    return findByCategory(category)
  }

  override fun delete(id: Long) {
    return delete(id)
  }
}