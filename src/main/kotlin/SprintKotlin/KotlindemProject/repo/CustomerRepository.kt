package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.model.Admin
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository : JpaRepository<Admin, Long>
