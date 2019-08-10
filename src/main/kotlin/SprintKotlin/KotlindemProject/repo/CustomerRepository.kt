package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.model.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface CustomerRepository : JpaRepository<Customer, Long> {
  fun findByLastName(lastName: String): Iterable<Customer>
}