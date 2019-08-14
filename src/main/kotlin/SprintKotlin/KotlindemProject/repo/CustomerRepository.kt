package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.dto.customer.CreateCustomerDto
import SprintKotlin.KotlindemProject.dto.customer.CustomerDto
import SprintKotlin.KotlindemProject.dto.customer.UpdateCustomerDto
import org.springframework.stereotype.Repository
import java.math.BigDecimal


@Repository
interface CustomerDtoService {
  fun create(createCustomerDto: CreateCustomerDto): CustomerDto
  fun update(updateCustomerDto: UpdateCustomerDto, id: Long): CustomerDto
  fun findById(id: Long): CustomerDto
  fun findByLastName(lastName: String): CustomerDto
  fun findByFirstName(firstName: String): CustomerDto
  fun findByAmount(amount: Int): CustomerDto
  fun findByPrice(price: BigDecimal): CustomerDto
  fun findByDescription(description: String): CustomerDto
  fun findByCategory(category: String): CustomerDto
  fun delete(id: Long)
}