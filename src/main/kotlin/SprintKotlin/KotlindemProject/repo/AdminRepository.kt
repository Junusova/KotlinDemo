package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.model.Admin
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.math.BigDecimal


@Repository
interface AdminRepository : JpaRepository<Admin, Long> {
  fun findByLastName(lastName: String): Iterable<Admin>
  fun findByFirstName(firstName: String): Iterable<Admin>
  fun findByAmount(amount: Int): Iterable<Admin>
  fun findByPrice(price: BigDecimal): Iterable<Admin>
  fun findByDescription(description: String): Iterable<Admin>
  fun findByCategory(category: String): Iterable<Admin>
}