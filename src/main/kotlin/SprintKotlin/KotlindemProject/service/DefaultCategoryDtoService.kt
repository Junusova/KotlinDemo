package SprintKotlin.KotlindemProject.service

import SprintKotlin.KotlindemProject.dto.category.CategoryDto
import SprintKotlin.KotlindemProject.dto.category.CreateCategoryDto
import SprintKotlin.KotlindemProject.dto.category.UpdateCategoryDto
import SprintKotlin.KotlindemProject.dto.items.ItemsDto
import SprintKotlin.KotlindemProject.model.Category
import SprintKotlin.KotlindemProject.repo.CategoryRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody


interface CategoryDtoService {
  fun create(createCategoryDto: CreateCategoryDto): CategoryDto
  fun update(updateCategoryDto: UpdateCategoryDto, id: Long): CategoryDto
  fun findById(id: Long): ItemsDto
  fun findByName(name: String): ItemsDto
  fun findByDescription(description: String)
  fun delete(id: Long)
}

@Service
class DefaultCategoryDtoService(
  private val categoryRepository: CategoryRepository
) : CategoryDtoService {


  @PostMapping
  override fun create(@RequestBody createCategoryDto: CreateCategoryDto): CategoryDto {
    val category = categoryRepository.save(
      Category(
        name = createCategoryDto.name,
        amount = createCategoryDto.amount,
        description = createCategoryDto.description
      )
    )

    return CategoryDto(
      id = category.id!!,
      amount = category.amount,
      description = category.description,
      name = category.name
    )

  }

  override fun update(updateCategoryDto: UpdateCategoryDto, id: Long): CategoryDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findById(id: Long): ItemsDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findByName(name: String): ItemsDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findByDescription(description: String) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun delete(id: Long) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

}
