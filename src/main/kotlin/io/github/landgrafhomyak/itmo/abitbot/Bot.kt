package io.github.landgrafhomyak.itmo.abitbot

import com.github.kotlintelegrambot.bot
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration("botConfig")
class Bot(
    @Value("\${tg.token}")
    private val token: String,
) {

    @Bean
    fun bot() = bot {
        token = this@Bot.token
    }
}
