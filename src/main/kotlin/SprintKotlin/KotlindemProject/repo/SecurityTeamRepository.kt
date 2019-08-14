package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.dto.guard.CreateGuardDto
import SprintKotlin.KotlindemProject.dto.guard.GuardDto
import SprintKotlin.KotlindemProject.dto.guard.UpdateGuardDto
import org.springframework.stereotype.Repository
import java.math.BigDecimal


@Repository
interface GuardDtoService {
  fun create(createGuardDtoDto: CreateGuardDto): GuardDto
  fun update(updateGuardDtoDto: UpdateGuardDto, id: Long): GuardDto
  fun findById(id: Long): GuardDto
  fun findByLastName(lastName: String): GuardDto
  fun findByFirstName(firstName: String): GuardDto
  fun findByAmount(amount: Int): GuardDto
  fun findByPrice(price: BigDecimal): GuardDto
  fun findByDescription(description: String): GuardDto
  fun findByCategory(category: String): GuardDto
  fun delete(id: Long)
}