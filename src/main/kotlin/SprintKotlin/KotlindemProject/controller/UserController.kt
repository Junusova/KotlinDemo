package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dtoService.UserDtoService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/user")
class UserController (private val userDtoService: UserDtoService)