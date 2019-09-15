package SprintKotlin.KotlindemProject.repo

import SprintKotlin.KotlindemProject.dto.category.CategoryDto
import SprintKotlin.KotlindemProject.model.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface CategoryRepository : JpaRepository<Category, Long> {

  @Query("select * from Category", nativeQuery = true)
  fun findAllCategory(): CategoryDto
}