package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.model.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository : JpaRepository<Customer, Long>
