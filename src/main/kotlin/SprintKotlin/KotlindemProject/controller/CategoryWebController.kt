package SprintKotlin.KotlindemProject.controller

import SprintKotlin.KotlindemProject.service.CategoryDtoService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/categories")
class CategoryWebController (private val categoriesDtoService: CategoryDtoService)