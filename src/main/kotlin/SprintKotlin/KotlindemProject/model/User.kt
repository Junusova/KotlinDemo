package SprintKotlin.KotlindemProject.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.ManyToMany
import javax.persistence.Table

@Entity
@Table(name = "user")

data class User(

  @Column(name = "email")
  val email: String,

  @Column(name = "password")
  val password: String,

  @Column(name = "passwordConfirm")
  val passwordConfirm: String,

  @ManyToMany
 val roles: Set<Role>

) : BaseEntity()