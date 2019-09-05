package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.model.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category, Long>