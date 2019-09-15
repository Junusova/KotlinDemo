package SprintKotlin.KotlindemProject.model

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "items")
data class Items(

  @ManyToOne()
  @JoinColumn(name = "category_id", nullable = false)
  var category: Category,

  @Column(name = "name")
  var name: String,

  @Column(name = "amount")
  var amount: BigDecimal,

  @Column(name = "price")
  var price: BigDecimal,

  @Column(name = "description")
  var description: String,

  @Column(name = "is_active")
  var isActive: Boolean

) : BaseEntity()