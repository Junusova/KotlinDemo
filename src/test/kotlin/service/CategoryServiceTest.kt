package service

import SprintKotlin.KotlindemProject.repo.CategoryRepository
import SprintKotlin.KotlindemProject.service.CategoryService
import helpers.createCategoryRequest
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mock
import utils.ServiceTest

class CategoryServiceTest : ServiceTest() {

  @Mock
  private lateinit var categoryRepository: CategoryRepository

  @Mock
  private lateinit var categoryService: CategoryService

  @Test
  fun createItemTest() {

    given(categoryRepository.save(createCategoryRequest())).willReturn(createCategoryRequest())
    val expected = categoryService.save(createCategoryRequest())
    assertEquals(expected, createCategoryRequest())
  }
}