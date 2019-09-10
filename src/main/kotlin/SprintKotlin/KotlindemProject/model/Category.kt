package SprintKotlin.KotlindemProject.model

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "categoryId")
data class Category (

  @OneToMany(mappedBy = "categoryId",fetch = FetchType.LAZY)
  var items: List<Items>,

  @Column(name = "name")
  var name: String,

  @Column(name = "description")
  var description: String,

  @Column(name = "amount")
  var amount: BigDecimal

) : BaseEntity()