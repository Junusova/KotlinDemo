package SprintKotlin.KotlindemProject.dto.lender
import java.math.BigDecimal

data class LenderDto(
  val id: Long,
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
  val email: String,
  val firstName: String,
  val lastName: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: String
)

data class UpdateLenderDto(
  val firstName: String,
  val lastName: String,
  val amount: Int,
  val price: BigDecimal,
  val description: String,
  val category: String
)