package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.dto.admin.AdminDto
import SprintKotlin.KotlindemProject.dto.admin.CreateAdminDto
import SprintKotlin.KotlindemProject.dto.admin.UpdateAdminDto
import SprintKotlin.KotlindemProject.model.Admin
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.math.BigDecimal


@Repository
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