package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.guard.CreateGuardDto
import SprintKotlin.KotlindemProject.dto.guard.GuardDto
import SprintKotlin.KotlindemProject.dto.guard.UpdateGuardDto
import SprintKotlin.KotlindemProject.model.SecurityTeam
import SprintKotlin.KotlindemProject.repo.GuardRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.math.BigDecimal

interface GuardDtoService {
  fun create(createGuardDto: CreateGuardDto): GuardDto
  fun update(updateGuardDto: UpdateGuardDto, id: Long): GuardDto
  fun findById(id: Long): GuardDto
  fun findByLastName(lastName: String): GuardDto
  fun findByFirstName(firstName: String): GuardDto
  fun findByAmount(amount: Int): GuardDto
  fun findByPrice(price: BigDecimal): GuardDto
  fun findByDescription(description: String): GuardDto
  fun findByCategory(category: String): GuardDto
  fun delete(id: Long)
}


@Service
class DefaultGuardDtoService(
  private val guardRepository: GuardRepository
) : GuardDtoService {

  @Transactional
  override fun create(createGuardDto: CreateGuardDto): GuardDto {
    return CreateGuardDto(
      "brown.smith@gmail.com",
      "Brown",
      "Smith",
      89,
      BigDecimal.valueOf(13.55),
      "Test description",
      "test category"
    ).let {
      SecurityTeam(
        firstName = it.firstName,
        description = it.description,
        amount = it.amount,
        category = it.category,
        lastName = it.lastName,
        price = it.price
      )
    }.let {
      guardRepository.save(it)
    }.let {
      GuardDto(
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
  override fun update(updateGuardDto: UpdateGuardDto, id: Long): GuardDto {
    val guard = guardRepository.getOne(id)
    guard.apply {
      firstName = updateGuardDto.firstName
      lastName = updateGuardDto.lastName
      amount = updateGuardDto.amount
      category = updateGuardDto.category
      price = updateGuardDto.price
      description = updateGuardDto.description
    }

    guardRepository.save(guard)

    return GuardDto(
      firstName = guard.firstName,
      lastName = guard.lastName,
      amount = guard.amount,
      category = guard.category,
      price = guard.price,
      description = guard.description,
      isActive = true,
      id = guard.id!!
    )
  }

  override fun findById(id: Long): GuardDto {
    return findById(id)
  }

  override fun findByLastName(lastName: String): GuardDto {
    return findByLastName(lastName)
  }

  override fun findByFirstName(firstName: String): GuardDto {
    return findByFirstName(firstName)
  }

  override fun findByAmount(amount: Int): GuardDto {
    return findByAmount(amount)
  }

  override fun findByPrice(price: BigDecimal): GuardDto {
    return findByPrice(price)
  }

  override fun findByDescription(description: String): GuardDto {
    return findByDescription(description)
  }

  override fun findByCategory(category: String): GuardDto {
    return findByCategory(category)
  }

  override fun delete(id: Long) {
    return delete(id)
  }
}
