package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.category.CategoryDto
import SprintKotlin.KotlindemProject.dto.category.CreateCategoryDto
import SprintKotlin.KotlindemProject.dto.category.UpdateCategoryDto
import SprintKotlin.KotlindemProject.service.CategoryDtoService
import SprintKotlin.KotlindemProject.service.CategoryService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/category")
class CategoryWebController (private val categoryDtoService: CategoryDtoService) {

  @PostMapping("/create")
  fun create(@RequestBody createCategoryDto: CreateCategoryDto): CategoryDto =
    categoryDtoService.create(createCategoryDto)

  @PutMapping("update/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody updateCategoryDto: UpdateCategoryDto
  ): CategoryDto =
   categoryDtoService.update(updateCategoryDto, id)

//  @DeleteMapping("/{id}")
//  fun delete(@PathVariable id: Long) = categoryDtoService.delete(id)
}