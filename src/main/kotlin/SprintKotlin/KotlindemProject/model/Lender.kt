package SprintKotlin.KotlindemProject.model

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "lender")
data class Lender(

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