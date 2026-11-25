package routing.diceroll

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureDiceRollRouting() {
    routing {
        diceFormRoute()
        rollResultRoute()
    }
}