// Task 4.5.1: Ktor application testing

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.testApplication

@Suppress("Unused")
class ApplicationTest : FreeSpec({
    "Path / yields 'Hello World!' greeting" {
        testApplication {
            configure()
            val response = client.get("/")
            response.status shouldBe HttpStatusCode.OK
            response.headers["Content-Type"]?.shouldContain("text/plain")
            response.bodyAsText() shouldBe "Hello World!"
        }
    }

    // Add more tests here

    "Path /hello/Sukuna yields 'Hello Sukuna!' greeting" {
        testApplication {
            configure()
            val response = client.get("/hello/Sukuna")
            response.status shouldBe HttpStatusCode.OK
            response.headers["Content-Type"]?.shouldContain("text/plain")
            response.bodyAsText() shouldBe "Hello Sukuna!"
        }
    }

    "Path /hello/Gojo yields 'Hello Gojo!' greeting" {
        testApplication {
            configure()
            val response = client.get("/hello/Gojo")
            response.status shouldBe HttpStatusCode.OK
            response.headers["Content-Type"]?.shouldContain("text/plain")
            response.bodyAsText() shouldBe "Hello Gojo!"
        }
    }

    "Path /hello/ yields '404 Not Found' error" {
        testApplication {
            configure()
            val response = client.get("/hello/")
            response.status shouldBe HttpStatusCode.NotFound
        }
    }
})
