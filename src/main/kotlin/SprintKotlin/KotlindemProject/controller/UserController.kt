package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.user.CreateUserDto
import SprintKotlin.KotlindemProject.dto.user.UserDto
import SprintKotlin.KotlindemProject.dtoService.UserDtoService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/user")
class UserController(private val userDtoService: UserDtoService) {

  @PostMapping("/create")
  fun create(@RequestBody createUserDto: CreateUserDto): UserDto =
    userDtoService.create(createUserDto)
}