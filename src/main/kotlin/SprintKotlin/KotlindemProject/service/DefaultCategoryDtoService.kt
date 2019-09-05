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
  fun findById(id: Long): CategoryDto
  fun findByName(name: String): CategoryDto
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
    val category = categoryRepository.getOne(id)
    category.apply {
      amount = updateCategoryDto.amount
      description = updateCategoryDto.description
      name = updateCategoryDto.name
    }

    return CategoryDto(
      id = category.id!!,
      amount = category.amount,
      description = category.description,
      name = category.name
    )
  }

  override fun findById(id: Long): CategoryDto {
    val category = categoryRepository.getOne(id)
    return CategoryDto(
      id = category.id!!,
      amount = category.amount,
      description = category.description,
      name = category.name
    )
  }

  override fun findByName(name: String):CategoryDto {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun findByDescription(description: String) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun delete(id: Long) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

}
