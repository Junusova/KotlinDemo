package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.category.CategoryDto
import SprintKotlin.KotlindemProject.dto.category.CreateCategoryDto
import SprintKotlin.KotlindemProject.dto.category.UpdateCategoryDto
import SprintKotlin.KotlindemProject.model.Category
import SprintKotlin.KotlindemProject.repo.CategoryRepository
import org.eclipse.jdt.internal.compiler.parser.Parser.name
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody


interface CategoryService {
  fun create(category: Category): Category
  fun update(updateCategoryDto: UpdateCategoryDto, id: Long): CategoryDto
  fun findById(id: Long): CategoryDto
  fun findByName(name: String): CategoryDto
  fun findByDescription(description: String)
  fun delete(id: Long)
  fun getItemById(id: Long) : Category
}

@Service
class DefaultCategoryService(
  private val categoryRepository: CategoryRepository
) : CategoryService {
  override fun create(category: Category): Category {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun update(updateCategoryDto: UpdateCategoryDto, id: Long): CategoryDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findById(id: Long): CategoryDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findByName(name: String): CategoryDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findByDescription(description: String) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun delete(id: Long) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }


  override fun getItemById(id: Long): Category  = categoryRepository.getOne(id)



}
