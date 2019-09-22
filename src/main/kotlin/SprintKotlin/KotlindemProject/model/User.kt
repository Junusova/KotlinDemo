package SprintKotlin.KotlindemProject.model

import SprintKotlin.KotlindemProject.enums.UserRole
import org.springframework.security.core.authority.SimpleGrantedAuthority
import java.util.stream.Collectors
import javax.persistence.*
import javax.validation.constraints.Size

@Entity
@Table(name = "user")

data class User(


  @Column(name = "email", nullable = false)
  @Size(min = 3, max = 255)
  var email: String,

  @Column(name = "password")
  var password: String,

  @Column(name = "passwordConfirm")
  val passwordConfirm: String,

  @Enumerated(EnumType.STRING)
  @ElementCollection(fetch = FetchType.EAGER)
  var roles: Set<UserRole>

) : BaseEntity(){
    fun getAuthorities(): User {
      return User(
        this.email, this.password,
        this.roles.stream().map { role -> SimpleGrantedAuthority("ROLE_$role") }.collect(Collectors.toSet()) as String
      )
    }
}