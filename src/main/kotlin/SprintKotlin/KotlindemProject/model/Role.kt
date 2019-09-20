package SprintKotlin.KotlindemProject.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.ManyToMany
import javax.persistence.Table

@Entity
@Table(name = "role")
data class Role (

  @Column(name = "name")

  val name: String,

  @ManyToMany(mappedBy = "role")
  private val users: Set<User>

): BaseEntity()