package SprintKotlin.KotlindemProject.model

import javax.persistence.*

@Entity
@Table(name = "customer")
data class Customer(

  @Column(name = "firstName")
  val firstName: String,

  @Column(name = "lastName")
  val lastName: String

) : BaseEntity()