package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.admin.AdminDto
import SprintKotlin.KotlindemProject.dto.admin.CreateAdminDto
import SprintKotlin.KotlindemProject.dto.admin.UpdateAdminDto
import SprintKotlin.KotlindemProject.model.Admin
import SprintKotlin.KotlindemProject.repo.AdminRepository
import org.springframework.beans.factory.annotation.Autowired
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

  @Transactional(readOnly = true)
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

  @Transactional(readOnly = true)
  override fun findByLastName(lastName: String): AdminDto {
    val admin = adminRepository.findByLastName(lastName)
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

  @Transactional(readOnly = true)
  override fun findByFirstName(firstName: String): AdminDto {
    val admin = adminRepository.findByFirstName(firstName)
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

  @Transactional(readOnly = true)
  override fun findByAmount(amount: Int): AdminDto {
    val admin = adminRepository.findByAmount(amount)
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

  @Transactional(readOnly = true)
  override fun findByPrice(price: BigDecimal): AdminDto {
    val admin = adminRepository.findByPrice(price)
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

  @Transactional(readOnly = true)
  override fun findByDescription(description: String): AdminDto {
    val admin = adminRepository.findByDescription(description)
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

  @Transactional(readOnly = true)
  override fun findByCategory(category: String): AdminDto {
    val admin = adminRepository.findByCategory(category)
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

  @Transactional()
  override fun delete(id: Long) {
    val admin = adminRepository.getOne(id)
    adminRepository.delete(admin)
  }
}