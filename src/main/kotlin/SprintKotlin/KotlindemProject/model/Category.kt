package SprintKotlin.KotlindemProject.model

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "category")
data class Category (


  //I'm not sure with mappedBy
  @OneToMany(mappedBy ="category",fetch = FetchType.EAGER)
  var items: List<Items>,

  @Column(name = "name")
  var name: String,

  @Column(name = "description")
  var description: String,

  @Column(name = "amount")
  var amount: BigDecimal

) : BaseEntity()