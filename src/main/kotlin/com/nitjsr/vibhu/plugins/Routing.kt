package com.nitjsr.vibhu.plugins

import com.nitjsr.vibhu.routes.randomRabbit
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {
    

    routing {
        randomRabbit()
        get("/joaquin144") {
            call.respondText("Tigre de sinaloa. I'm not he president of Mexico I'm the boss of Mexico.")
        }
        get("/show-some-html") {
            call.respondRedirect("https://medium.com/@omkard/kotlin-ktor-vs-golang-performance-eb3c56127373")
        }
        // Static plugin. Try to access `/static/index.html`
        //static("/static"){....} ko keval static{...} bana do
        static {
            resources("static")
        }
    }
}
