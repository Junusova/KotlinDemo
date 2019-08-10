package SprintKotlin.KotlindemProject.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "bodyguard")
data class SecurityTeam (

  @Column(name = "firstName")
  val firstName: String,

  @Column(name = "lastName")
  val lastName: String
) : BaseEntity()