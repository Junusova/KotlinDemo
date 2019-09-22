package SprintKotlin.KotlindemProject.service

interface SecurityService {
  fun findLoggedInUsername(): String

  fun autoLogin(username: String, password: String)
}