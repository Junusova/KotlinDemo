package service

import SprintKotlin.KotlindemProject.repo.ItemsRepository
import SprintKotlin.KotlindemProject.service.ItemsService
import helpers.takeCreateItemRequest
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mock
import utils.ServiceTest


class ItemServiceTest : ServiceTest() {

  @Mock
  private val itemsRepository: ItemsRepository? = null

  @Mock
  private lateinit var itemsService: ItemsService

  @Test
  fun createItemTest() {
    if (itemsRepository != null) {
      given(itemsRepository.save(takeCreateItemRequest())).willReturn(takeCreateItemRequest())
      val expected = itemsService.save(takeCreateItemRequest())
      assertEquals(expected, takeCreateItemRequest())
    }
  }
}