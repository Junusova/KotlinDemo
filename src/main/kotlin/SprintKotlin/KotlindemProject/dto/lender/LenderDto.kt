package SprintKotlin.KotlindemProject.dto.lender
import org.hibernate.validator.constraints.Email

data class LenderDto(
  val id: Long
  val email: String,
  val isActive: Boolean,
  val firstName: String,
  val lastName: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: String
)

data class CreateLenderDto(
  @field:Email
  val email: String,
  val firstName: String,
  val lastName: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: String
)