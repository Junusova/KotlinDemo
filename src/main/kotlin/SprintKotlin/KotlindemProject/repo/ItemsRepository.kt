package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.model.Items
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import java.math.BigDecimal

interface ItemsRepository : JpaRepository<Items, Long> {

  @Query("select name from Items name where name = :name", nativeQuery = true)
  fun findByName(@Param("name") name: String): Items

  @Query("select amount from Items amount where Items.amount = :amount", nativeQuery = true)
  fun findByAmount(@Param("amount") amount: Int): Items

  @Query("select price from Items price where Items.price = :price", nativeQuery = true)
  fun findByPrice(@Param("price") price: BigDecimal): Items

  @Query("select description from Items description where Items.price = :description", nativeQuery = true)
  fun findByDescription(@Param("description") description: String): Items

  @Query("select categoryId from Items categoryId where Items.price = :categoryId", nativeQuery = true)
  fun findByCategory(@Param("categoryId") category: String): Items

}