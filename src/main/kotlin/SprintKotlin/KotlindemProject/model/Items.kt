package SprintKotlin.KotlindemProject.model

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "items")
data class Items(

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "categories_id")
  var categories: Category?,

  @Column(name = "name")
  var name: String,

  @Column(name = "amount")
  var amount: BigDecimal,

  @Column(name = "price")
  var price: BigDecimal,

  @Column(name = "description")
  var description: String,

  @Column(name = "is_active")
  var isActive: Boolean?

) : BaseEntity()