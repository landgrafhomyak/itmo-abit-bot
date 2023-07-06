package io.github.landgrafhomyak.itmo.abitbot

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AbitBotApplication : ApplicationRunner {

    override fun run(args: ApplicationArguments) {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>) {
    runApplication<AbitBotApplication>(*args)
}
