package SprintKotlin.KotlindemProject.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest


@RestController
@RequestMapping("/api/user")
class UserController {
  @RequestMapping("/success")
  fun success(request: HttpServletRequest): String {
    return "success"
  }

}