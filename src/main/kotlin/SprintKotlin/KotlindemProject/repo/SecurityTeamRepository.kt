package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.model.SecurityTeam
import org.springframework.data.jpa.repository.JpaRepository

interface GuardRepository : JpaRepository<SecurityTeam, Long>