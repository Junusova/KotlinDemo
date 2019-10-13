package SprintKotlin.KotlindemProject.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.http.HttpMethod
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class JsonLoginFilter (
  private val objectMapper: ObjectMapper, defaultProcessUrl: String) :
  AbstractAuthenticationProcessingFilter(defaultProcessUrl) {

  override fun attemptAuthentication(request: HttpServletRequest, response: HttpServletResponse): Authentication {
    if (HttpMethod.POST.name != request.method) {
      if (logger.isDebugEnabled) {
        logger.debug("Authentication method not supported. Request method: " + request.method)
      }
    }

    val loginRequest = objectMapper.readValue(request.reader, Login::class.java)

    val token = UsernamePasswordAuthenticationToken(loginRequest.username, loginRequest.password)
    return this.authenticationManager.authenticate(token)
  }

}