package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.lender.CreateLenderDto
import SprintKotlin.KotlindemProject.dto.lender.LenderDto
import SprintKotlin.KotlindemProject.dto.lender.UpdateLenderDto
import SprintKotlin.KotlindemProject.repo.LenderRepository
import org.springframework.stereotype.Service
import java.math.BigDecimal

interface LenderDtoService {
  fun create(createLenderDto: CreateLenderDto): LenderDto
  fun update(updateLenderDto: UpdateLenderDto, id: Long): LenderDto
  fun findById(id: Long): LenderDto
  fun findByLastName(lastName: String): LenderDto
  fun findByFirstName(firstName: String): LenderDto
  fun findByAmount(amount: Int): LenderDto
  fun findByPrice(price: BigDecimal): LenderDto
  fun findByDescription(description: String): LenderDto
  fun findByCategory(category: String): LenderDto
  fun delete(id: Long)
}


@Service
class DefaultLenderDtoService(
  private val customerRepository: LenderRepository
) : LenderDtoService {

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

  override fun findById(id: Long): LenderDto {
    return findById(id)
  }

  override fun findByLastName(lastName: String): LenderDto {
    return findByLastName(lastName)
  }

  override fun findByFirstName(firstName: String): LenderDto {
    return findByFirstName(firstName)
  }

  override fun findByAmount(amount: Int): LenderDto {
    return findByAmount(amount)
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