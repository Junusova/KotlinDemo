package SprintKotlin.KotlindemProject.model

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table


@Entity
@Table(name = "category")
data class Category (

  @Column(name = "name")
  var name: String,

  @Column(name = "description")
  var description: String,

  @Column(name = "amount")
  var amount: BigDecimal

) : BaseEntity()