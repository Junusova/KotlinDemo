package SprintKotlin.KotlindemProject.model

import SprintKotlin.KotlindemProject.enums.UserRole
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
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

) : UserDetails,BaseEntity() {
  override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun isEnabled(): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun getUsername(): String {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun isCredentialsNonExpired(): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun getPassword(): String {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun isAccountNonExpired(): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun isAccountNonLocked(): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}
