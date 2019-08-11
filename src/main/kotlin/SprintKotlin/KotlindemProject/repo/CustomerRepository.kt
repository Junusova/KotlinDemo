package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.model.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.math.BigDecimal


@Repository
interface CustomerRepository : JpaRepository<Customer, Long> {
  fun findByLastName(lastName: String): Iterable<Customer>
  fun findByFirstName(firstName: String): Iterable<Customer>
  fun findByAmount(amount: Int): Iterable<Customer>
  fun findByPrice(price: BigDecimal): Iterable<Customer>
  fun findByDescription(description: String): Iterable<Customer>
  fun findByCategory(category: String): Iterable<Customer>
}