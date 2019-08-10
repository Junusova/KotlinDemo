package SprintKotlin.KotlindemProject.model

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity() {

  constructor(id: Long?) : this() {
    this.id = id
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  open var id: Long? = null

}