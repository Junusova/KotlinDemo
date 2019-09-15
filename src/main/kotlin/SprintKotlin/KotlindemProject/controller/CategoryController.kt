package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.category.CategoryDto
import SprintKotlin.KotlindemProject.dto.category.CreateCategoryDto
import SprintKotlin.KotlindemProject.dto.category.GetAllCategoryRequestDto
import SprintKotlin.KotlindemProject.dto.category.UpdateCategoryDto
import SprintKotlin.KotlindemProject.dtoService.CategoryDtoService
import SprintKotlin.KotlindemProject.model.Category
import SprintKotlin.KotlindemProject.repo.CategoryRepository
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/category")
class CategoryController (
  private val categoryDtoService: CategoryDtoService,
  private val categoryRepository: CategoryRepository
) {

  @PostMapping("/create")
  fun create(@RequestBody createCategoryDto: CreateCategoryDto): CategoryDto =
    categoryDtoService.create(createCategoryDto)

  @PutMapping("update/{id}")
  fun update(
    @PathVariable id: Long,
    @RequestBody updateCategoryDto: UpdateCategoryDto
  ): CategoryDto =
   categoryDtoService.update(updateCategoryDto, id)

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) = categoryDtoService.delete(id)

  @GetMapping
  fun getAll(categoryDto: CategoryDto) = categoryRepository.findAllCategory()
  }