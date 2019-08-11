package SprintKotlin.KotlindemProject.model

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "customer")
data class Customer(

  @Column(name = "firstName")
  val firstName: String,

  @Column(name = "lastName")
  val lastName: String,

  @Column(name = "amount")
  val amount: Int,

  @Column(name = "price")
  val price: BigDecimal,

  @Column(name = "description")
  val description: String,

  @Column(name = "category")
  val category: String

) : BaseEntity()