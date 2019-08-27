package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.customer.CreateCustomerDto
import SprintKotlin.KotlindemProject.dto.customer.CustomerDto
import SprintKotlin.KotlindemProject.dto.customer.UpdateCustomerDto
import SprintKotlin.KotlindemProject.repo.CustomerDtoService
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class DefaultCustomerDtoService (
  private val customerService: CustomerDtoService
): CustomerDtoService {

  override fun create(createCustomerDto: CreateCustomerDto): CustomerDto {
    return customerService.create(createCustomerDto)
  }

  override fun update(updateCustomerDto: UpdateCustomerDto, id: Long): CustomerDto {
    return customerService.update(updateCustomerDto, id)
  }

  override fun findById(id: Long): CustomerDto {
    return customerService.findById(id)
  }

  override fun findByLastName(lastName: String): CustomerDto {
    return customerService.findByLastName(lastName)
  }

  override fun findByFirstName(firstName: String): CustomerDto {
    return customerService.findByFirstName(firstName)
  }

  override fun findByAmount(amount: Int): CustomerDto {
    return  customerService.findByAmount(amount)
  }

  override fun findByPrice(price: BigDecimal): CustomerDto {
    return customerService.findByPrice(price)
  }

  override fun findByDescription(description: String): CustomerDto {
    return customerService.findByDescription(description)
  }

  override fun findByCategory(category: String): CustomerDto {
    return customerService.findByCategory(category)
  }

  override fun delete(id: Long) {
    return customerService.delete(id)
  }
}