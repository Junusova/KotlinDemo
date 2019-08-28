package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.admin.AdminDto
import SprintKotlin.KotlindemProject.dto.customer.CreateCustomerDto
import SprintKotlin.KotlindemProject.dto.customer.CustomerDto
import SprintKotlin.KotlindemProject.dto.customer.UpdateCustomerDto
import SprintKotlin.KotlindemProject.repo.CustomerDtoService
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class DefaultCustomerDtoService : CustomerDtoService {

  override fun create(createCustomerDto: CreateCustomerDto): CustomerDto {
    return create(CreateCustomerDto(
      "billy.bobby@gmail.com",
      "Billy",
      "Bobby",
      89655,
      BigDecimal.valueOf(56.98),
      "Test description",
      "test category"
    ))
  }

  override fun update(updateCustomerDto: UpdateCustomerDto, id: Long): CustomerDto {
    return update(updateCustomerDto, id)
  }

  override fun findById(id: Long): CustomerDto {
    return findById(id)
  }

  override fun findByLastName(lastName: String): CustomerDto {
    return findByLastName(lastName)
  }

  override fun findByFirstName(firstName: String): CustomerDto {
    return findByFirstName(firstName)
  }

  override fun findByAmount(amount: Int): CustomerDto {
    return  findByAmount(amount)
  }

  override fun findByPrice(price: BigDecimal): CustomerDto {
    return findByPrice(price)
  }

  override fun findByDescription(description: String): CustomerDto {
    return findByDescription(description)
  }

  override fun findByCategory(category: String): CustomerDto {
    return findByCategory(category)
  }

  override fun delete(id: Long) {
    return delete(id)
  }
}