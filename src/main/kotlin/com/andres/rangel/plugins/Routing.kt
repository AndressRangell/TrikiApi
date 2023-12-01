package com.andres.rangel.plugins

import com.andres.rangel.models.TrikiGame
import com.andres.rangel.socket
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting(game: TrikiGame) {
    routing {
        socket(game)
    }
}
