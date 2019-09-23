package SprintKotlin.KotlindemProject.model

import SprintKotlin.KotlindemProject.enums.UserRole
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.core.userdetails.UserDetails
import javax.persistence.*
import javax.validation.constraints.Size

@Entity
@Table(name = "user")

data class User(


  @Column(name = "email", nullable = false, unique = true)
  @Size(min = 3, max = 255)
  var email: String,

  @Column(name = "passwordConfirm")
  val passwordConfirm: String,

  @Column(name = "password", nullable = false)
  private var password: String,

  @Enumerated(EnumType.STRING)
  @ElementCollection(fetch = FetchType.EAGER)
  var roles: Set<UserRole>

) : UserDetails, BaseEntity() {

  override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
    return AuthorityUtils.createAuthorityList("VALID_USER_ROLE")
  }

  override fun isEnabled(): Boolean {
    return true
  }

  override fun getUsername(): String {
    return email
  }

  override fun isCredentialsNonExpired(): Boolean {
    return true
  }

  override fun getPassword(): String {
    return password
  }

  override fun isAccountNonExpired(): Boolean {
    return true
  }

  override fun isAccountNonLocked(): Boolean {
    return true
  }
}
