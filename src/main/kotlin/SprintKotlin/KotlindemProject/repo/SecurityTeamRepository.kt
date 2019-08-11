package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.model.SecurityTeam
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.math.BigDecimal


@Repository
interface SecurityTeamRepository : JpaRepository<SecurityTeam, Long> {
  fun findByLastName(lastName: String): Iterable<SecurityTeam>
  fun findByFirstName(firstName: String): Iterable<SecurityTeam>
  fun findByAmount(amount: Int): Iterable<SecurityTeam>
  fun findByPrice(price: BigDecimal): Iterable<SecurityTeam>
  fun findByDescription(description: String): Iterable<SecurityTeam>
  fun findByCategory(category: String): Iterable<SecurityTeam>
}