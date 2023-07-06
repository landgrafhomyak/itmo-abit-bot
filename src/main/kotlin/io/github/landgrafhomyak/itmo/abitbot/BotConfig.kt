package io.github.landgrafhomyak.itmo.abitbot

import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.bot
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BotConfig(
    @Value("\${tg.token}")
    private val token: String,
) {

    @Bean
    fun bot(): Bot = bot {
        token = this@BotConfig.token
    }
}
