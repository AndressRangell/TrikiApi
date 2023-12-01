package com.andres.rangel

import com.andres.rangel.models.TrikiGame
import com.andres.rangel.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val game = TrikiGame()
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureRouting(game)
}
