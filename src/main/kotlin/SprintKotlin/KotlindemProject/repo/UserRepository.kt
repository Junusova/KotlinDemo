package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {

  fun findByUsername(username: String): User
}