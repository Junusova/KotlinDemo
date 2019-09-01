package SprintKotlin.KotlindemProject.model

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "customer")
data class Customer(

  @Column(name = "firstName")
  var firstName: String,

  @Column(name = "lastName")
  var lastName: String,

  @Column(name = "amount")
  var amount: Int,

  @Column(name = "price")
  var price: BigDecimal,

  @Column(name = "description")
  var description: String,

  @Column(name = "category")
  var category: String

) : BaseEntity()