package SprintKotlin.KotlindemProject.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.password.NoOpPasswordEncoder
import javax.sql.DataSource


@Configuration
@EnableWebSecurity
class WebSecurityConfig : WebSecurityConfigurerAdapter() {
  @Qualifier("dataSource")
  @Autowired
  private val dataSource: DataSource? = null
  @Throws(Exception::class)
  override fun configure(http: HttpSecurity) {
    http
      .authorizeRequests()
      .antMatchers("/").permitAll()
      .anyRequest().authenticated()
      .and()
      .formLogin()
      .loginPage("/login")
      .permitAll()
      .and()
      .logout()
      .permitAll()
  }

  override fun configure(auth: AuthenticationManagerBuilder?) {
    auth?.jdbcAuthentication()?.
      dataSource(dataSource)?.
      passwordEncoder(NoOpPasswordEncoder.getInstance())?.usersByUsernameQuery("select email, password, active from userme where email=? ")?.authoritiesByUsernameQuery("select u.email, ur.roles from userme u inner join userme_roles ur on u.id = ur.users_id where u.email=?")

  }

}