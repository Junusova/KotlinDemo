package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.category.CategoryDto
import SprintKotlin.KotlindemProject.dto.category.CreateCategoryDto
import SprintKotlin.KotlindemProject.dto.category.UpdateCategoryDto
import SprintKotlin.KotlindemProject.service.CategoryDtoService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/categories")
class CategoryWebController (private val categoriesDtoService: CategoryDtoService) {

  @PostMapping("/create")
  fun create(@RequestBody createCategoryDto: CreateCategoryDto): CategoryDto =
    categoriesDtoService.create(createCategoryDto)

  @PutMapping("update/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody updateCategoryDto: UpdateCategoryDto
  ): CategoryDto =
   categoriesDtoService.update(updateCategoryDto, id)

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = categoriesDtoService.delete(id)
}