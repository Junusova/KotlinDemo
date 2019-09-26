package SprintKotlin.KotlindemProject.model

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "category")
data class Category (

  @OneToMany(mappedBy ="category",fetch = FetchType.LAZY)
  var items: List<Items>,

  @Column(name = "name")
  var name: String,

  @Column(name = "description")
  var description: String,

  @Column(name = "amount")
  var amount: BigDecimal

) : BaseEntity()