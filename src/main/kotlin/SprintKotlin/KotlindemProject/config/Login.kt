package SprintKotlin.KotlindemProject.config

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

class Login  @JsonCreator constructor (
  @param:JsonProperty("username") val username: String,
  @param:JsonProperty("password") val password: String
)