package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.dto.category.CategoryDto
import SprintKotlin.KotlindemProject.dto.category.CreateCategoryDto
import SprintKotlin.KotlindemProject.dto.category.UpdateCategoryDto
import SprintKotlin.KotlindemProject.dtoService.CategoryDtoService
import SprintKotlin.KotlindemProject.repo.CategoryRepository
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/category")
@Api(value = "Categories")

class CategoryController(
        private val categoryDtoService: CategoryDtoService,
        private val categoryRepository: CategoryRepository
) {

    @ApiOperation(value = "Create Category")
    @ApiResponse(code = 200,
                 message = "OK")
    @PostMapping("/create")
    fun create(@RequestBody createCategoryDto: CreateCategoryDto): CategoryDto =
            categoryDtoService.create(createCategoryDto)


    @PutMapping("update/{id}")
    @ApiOperation(value = "Update Category By Id")
    @ApiResponse(code = 200,
                 message = "OK")
    fun update(
            @PathVariable id: Long,
            @RequestBody updateCategoryDto: UpdateCategoryDto
    ): CategoryDto =
            categoryDtoService.update(updateCategoryDto, id)


    @ApiOperation(value = "Delete Category By Id")
    @ApiResponse(code = 200,
                 message = "OK")
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = categoryDtoService.delete(id)


    @ApiOperation(value = "Get Category By Id")
    @ApiResponse(code = 200,
                 message = "OK")
    @GetMapping
    fun getAll(categoryDto: CategoryDto) = categoryRepository.findAllCategory()
}