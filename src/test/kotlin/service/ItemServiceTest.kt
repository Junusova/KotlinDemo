package service

import SprintKotlin.KotlindemProject.model.Items
import SprintKotlin.KotlindemProject.repo.ItemsRepository
import SprintKotlin.KotlindemProject.service.ItemsService
import helpers.takeCreateItemRequest
import org.junit.Test
import org.junit.jupiter.api.DisplayName
import org.mockito.ArgumentMatchers
import org.mockito.BDDMockito.given
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.doReturn
import utils.ServiceTest
import java.util.*
import org.assertj.core.api.Assertions.assertThat


class ItemServiceTest : ServiceTest() {


  @Mock
  private val itemsRepository: ItemsRepository? = null

  @InjectMocks
  private val itemsService: ItemsService? = null

  @Test
  fun whenFindAll_thenReturnProductList() {
    // given
    val createItemRequest = takeCreateItemRequest()

    val expectedProducts = Arrays.asList(createItemRequest)

    doReturn(expectedProducts).`when`(itemsRepository)!!.findAll()

    // when
    val actualItems = itemsService

    // then
    assertThat(actualItems).isEqualTo(expectedProducts)
  }

}