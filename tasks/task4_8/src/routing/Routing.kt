// Task 4.8: organizing routes

package routing

import io.ktor.server.application.*
import routing.diceroll.*

// Routing configuration

fun Application.configureRouting() {
    configureDiceRollRouting()
}