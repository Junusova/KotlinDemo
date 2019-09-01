package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.customer.CreateCustomerDto
import SprintKotlin.KotlindemProject.dto.customer.CustomerDto
import SprintKotlin.KotlindemProject.dto.customer.UpdateCustomerDto
import SprintKotlin.KotlindemProject.model.Customer
import SprintKotlin.KotlindemProject.repo.CustomerRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.math.BigDecimal

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

@Service
class DefaultCustomerDtoService(
  private val customerRepository: CustomerRepository
) : CustomerDtoService {

  @Transactional
  override fun create(createCustomerDto: CreateCustomerDto): CustomerDto {
    return CreateCustomerDto(
      "brown.smith@gmail.com",
      "Brown",
      "Smith",
      89,
      BigDecimal.valueOf(13.55),
      "Test description",
      "test category"
    ).let {
      Customer(
        firstName = it.firstName,
        description = it.description,
        amount = it.amount,
        category = it.category,
        lastName = it.lastName,
        price = it.price
      )
    }.let {
      customerRepository.save(it)
    }.let {
      CustomerDto(
        id = it.id!!,
        firstName = it.firstName,
        description = it.description,
        amount = it.amount,
        category = it.category,
        lastName = it.lastName,
        price = it.price,
        isActive = true
      )
    }
  }

  @Transactional
  override fun update(updateCustomerDto: UpdateCustomerDto, id: Long): CustomerDto {
    val customer = customerRepository.getOne(id)
    customer.apply {
      firstName = updateCustomerDto.firstName
      lastName = updateCustomerDto.lastName
      amount = updateCustomerDto.amount
      category = updateCustomerDto.category
      price = updateCustomerDto.price
      description = updateCustomerDto.description
    }

    customerRepository.save(customer)

    return CustomerDto(
      firstName = customer.firstName,
      lastName = customer.lastName,
      amount = customer.amount,
      category = customer.category,
      price = customer.price,
      description = customer.description,
      isActive = true,
      id = customer.id!!
    )
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
    return findByAmount(amount)
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