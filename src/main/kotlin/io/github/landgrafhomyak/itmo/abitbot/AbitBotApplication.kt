package io.github.landgrafhomyak.itmo.abitbot

import com.github.kotlintelegrambot.Bot
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AbitBotApplication(
    private val bot: Bot,
) : ApplicationRunner {

    override fun run(args: ApplicationArguments) {
        bot.startPolling()
    }
}

fun main(args: Array<String>) {
    runApplication<AbitBotApplication>(*args)
}
