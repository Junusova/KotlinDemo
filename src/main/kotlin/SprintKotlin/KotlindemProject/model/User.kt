package SprintKotlin.KotlindemProject.model

import com.sun.istack.internal.NotNull
import org.hibernate.annotations.NaturalId
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.ManyToMany
import javax.persistence.Table
import javax.validation.constraints.Size

@Entity
@Table(name = "user")

data class User(
  @Column(name = "email", nullable = false)
  var email: String,

  @NaturalId
  @Column(name = "username", unique = true, nullable = false)
  @NotNull
  @Size(min = 3, max = 255)
  var username: String = email,

  @Column(name = "password")
  val password: String,

  @Column(name = "passwordConfirm")
  val passwordConfirm: String,

  @ManyToMany
 val roles: Set<Role>
) : BaseEntity()