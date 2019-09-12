package controller

import SprintKotlin.KotlindemProject.dto.items.ItemsDto
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody


@Controller
class ItemController {

  @ResponseBody
  @PostMapping("/api/create")
  fun create(): String {
    return ItemsDto
  }

}