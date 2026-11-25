package routing.diceroll

import io.ktor.server.pebble.*
import io.ktor.server.routing.*

fun Route.diceFormRoute() {
    get("/") {
        call.respondTemplate("form.peb", emptyMap())
    }
}