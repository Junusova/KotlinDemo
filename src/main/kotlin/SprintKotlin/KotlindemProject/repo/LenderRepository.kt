package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.dto.lender.CreateLenderDto
import SprintKotlin.KotlindemProject.dto.lender.LenderDto
import SprintKotlin.KotlindemProject.dto.lender.UpdateLenderDto
import org.springframework.stereotype.Repository
import java.math.BigDecimal


@Repository
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