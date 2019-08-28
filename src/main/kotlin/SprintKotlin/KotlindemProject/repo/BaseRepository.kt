package SprintKotlin.KotlindemProject.repo

import org.springframework.data.jpa.repository.JpaRepository

interface BaseRepository<T, Long> : JpaRepository <T, Long>