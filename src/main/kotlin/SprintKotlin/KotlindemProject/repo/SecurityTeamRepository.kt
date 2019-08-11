package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.model.Lender
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.math.BigDecimal


@Repository
interface SecurityTeamRepository : JpaRepository<Lender, Long> {
  fun findByLastName(lastName: String): Iterable<Lender>
  fun findByFirstName(firstName: String): Iterable<Lender>
  fun findByAmount(amount: Int): Iterable<Lender>
  fun findByPrice(price: BigDecimal): Iterable<Lender>
  fun findByDescription(description: String): Iterable<Lender>
  fun findByCategory(category: String): Iterable<Lender>
}