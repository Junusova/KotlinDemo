package service

import SprintKotlin.KotlindemProject.service.ItemsService
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.jupiter.api.DisplayName
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ItemServiceTest {



  @DisplayName("Test Spring @Autowired Integration")
  @Test
  internal fun testGet() {
    assertEquals("get", ItemsService)
  }

}