package SprintKotlin.KotlindemProject.repo

import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<Role, Long> {
  fun findByRolename(roleName: String): Role
}