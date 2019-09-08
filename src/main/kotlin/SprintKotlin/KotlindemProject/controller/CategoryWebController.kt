package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.category.CategoryDto
import SprintKotlin.KotlindemProject.dto.category.CreateCategoryDto
import SprintKotlin.KotlindemProject.dto.category.UpdateCategoryDto
import SprintKotlin.KotlindemProject.service.CategoryService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/categories")
class CategoryWebController (private val categoriesService: CategoryService) {

  @PostMapping("/create")
  fun create(@RequestBody createCategoryDto: CreateCategoryDto): CategoryDto =
    categoriesService.create(createCategoryDto)

  @PutMapping("update/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody updateCategoryDto: UpdateCategoryDto
  ): CategoryDto =
   categoriesService.update(updateCategoryDto, id)

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = categoriesService.delete(id)
}