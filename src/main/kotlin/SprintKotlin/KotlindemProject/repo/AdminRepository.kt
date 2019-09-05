package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.model.Admin
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface AdminRepository:JpaRepository<Admin, Long> {

  @Query("select first_name from admin where admin.first_name = :first_name")
  fun findByFirstName(@Param("first_name") firstName: String): Admin
}