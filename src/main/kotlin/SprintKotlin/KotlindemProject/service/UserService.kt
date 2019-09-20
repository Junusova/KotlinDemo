package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.domain.CreateUserRequest
import SprintKotlin.KotlindemProject.model.User

interface UserService {
  fun create(createUserRequest: CreateUserRequest): User
}