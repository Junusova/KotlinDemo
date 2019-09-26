package SprintKotlin.KotlindemProject.model

import javax.persistence.Entity
import javax.persistence.ManyToMany
import javax.persistence.Table

@Entity
@Table(name = "role")
data class Role (
  val name: String,

  @ManyToMany(mappedBy = "roles")
  val users: Set<User>

): BaseEntity()


