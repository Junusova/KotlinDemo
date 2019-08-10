package SprintKotlin.KotlindemProject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class KotlindemProjectApplication

fun main(args: Array<String>) {
	runApplication<KotlindemProjectApplication>(*args)
}
