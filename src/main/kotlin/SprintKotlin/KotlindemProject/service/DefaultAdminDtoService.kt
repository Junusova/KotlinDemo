package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.admin.AdminDto
import SprintKotlin.KotlindemProject.dto.admin.CreateAdminDto
import SprintKotlin.KotlindemProject.dto.admin.UpdateAdminDto
import SprintKotlin.KotlindemProject.dto.customer.CustomerDto
import SprintKotlin.KotlindemProject.model.Admin
import SprintKotlin.KotlindemProject.repo.AdminRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.math.BigDecimal

interface AdminDtoService {
  fun create(createAdminDto: CreateAdminDto): AdminDto
  fun update(updateAdminDto: UpdateAdminDto, id: Long): AdminDto
  fun findById(id: Long): AdminDto
  fun findByLastName(lastName: String): AdminDto
  fun findByFirstName(firstName: String): AdminDto
  fun findByAmount(amount: Int): AdminDto
  fun findByPrice(price: BigDecimal): AdminDto
  fun findByDescription(description: String): AdminDto
  fun findByCategory(category: String): AdminDto
  fun delete(id: Long)
}

@Service
class DefaultAdminDtoService(
  private val adminRepository: AdminRepository
) : AdminDtoService {

  @Transactional
  override fun create(createAdminDto: CreateAdminDto): AdminDto {
    return CreateAdminDto(
      "brown.smith@gmail.com",
      "Brown",
      "Smith",
      89,
      BigDecimal.valueOf(13.55),
      "Test description",
      "test category"
    ).let {
      Admin(
        firstName = it.firstName,
        description = it.description,
        amount = it.amount,
        category = it.category,
        lastName = it.lastName,
        price = it.price,
        is_active = true
      )
    }.let {
      adminRepository.save(it)
    }.let {
      AdminDto(
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
  override fun update(updateAdminDto: UpdateAdminDto, id: Long): AdminDto {
    val admin = adminRepository.getOne(id)
    admin.apply {
      firstName = updateAdminDto.firstName
      lastName = updateAdminDto.lastName
      amount = updateAdminDto.amount
      category = updateAdminDto.category
      price = updateAdminDto.price
      description = updateAdminDto.description
    }

    adminRepository.save(admin)

    return AdminDto(
      firstName = admin.firstName,
      lastName = admin.lastName,
      amount = admin.amount,
      category = admin.category,
      price = admin.price,
      description = admin.description,
      isActive = admin.is_active,
      id = admin.id!!
    )
  }

  override fun findById(id: Long): AdminDto {
   val admin = adminRepository.getOne(id)
   return AdminDto(
     firstName = admin.firstName,
     lastName = admin.lastName,
     amount = admin.amount,
     category = admin.category,
     price = admin.price,
     description = admin.description,
     isActive = admin.is_active,
     id = admin.id!!
   )
  }

  override fun findByLastName(lastName: String): AdminDto {
    return findByLastName(lastName)
  }

  override fun findByFirstName(firstName: String): AdminDto {
    return findByFirstName(firstName)
  }

  override fun findByAmount(amount: Int): AdminDto {
    return findByAmount(amount)
  }

  override fun findByPrice(price: BigDecimal): AdminDto {
    return findByPrice(price)
  }

  override fun findByDescription(description: String): AdminDto {
    return findByDescription(description)
  }

  override fun findByCategory(category: String): AdminDto {
    return findByCategory(category)
  }

  override fun delete(id: Long) {
    val admin = adminRepository.getOne(id)
    adminRepository.delete(admin)
  }
}