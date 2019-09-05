package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.model.Admin
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import java.math.BigDecimal

interface AdminRepository:JpaRepository<Admin, Long> {

  @Query("select first_name from Admin first_name where Admin.first_name = :first_name")
  fun findByFirstName(@Param("first_name") firstName: String): Admin

  @Query("select last_name from Admin last_name where Admin.last_name = :last_name")
  fun findByLastName(@Param("last_name") lastName: String): Admin

  @Query("select amount from Admin amount where Admin.amount = :amount")
  fun findByAmount(@Param("amount") amount: Int): Admin

  @Query("select price from Admin price where Admin.price = :price")
  fun findByPrice(@Param("price") price: BigDecimal): Admin

  @Query("select description from Admin description where Admin.price = :description")
  fun findByDescription(@Param("description") description: String): Admin

  @Query("select category from Admin category where Admin.price = :category")
  fun findByCategory(@Param("category") category: String): Admin
}