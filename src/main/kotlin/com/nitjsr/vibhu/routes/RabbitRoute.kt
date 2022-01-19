package com.nitjsr.vibhu.routes

import com.nitjsr.vibhu.data.model.Rabbit
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private const val BASE_URL = "http://192.168.29.197:8080"
private val rabbits = listOf(//By default static ke andar dhoondta hai files ko so directly write rabbits not static
    Rabbit("Carl", "A cute brown rabbit", "$BASE_URL/rabbits/one.jpg"),
    Rabbit("Emma", "Emma likes to eat apples", "$BASE_URL/rabbits/two.jpg"),
    Rabbit("Florian", "Florian is always hungry", "$BASE_URL/rabbits/three.jpg"),
    Rabbit("Federico", "Federico likes to climb mountains", "$BASE_URL/rabbits/four.jpg"),
    Rabbit("Gina", "Gina is a true beauty", "$BASE_URL/rabbits/five.jpg"),
)

//Here I'm making extension function of Route class
fun Route.randomRabbit(){
    get("/randomrabbit"){
        //call.parameters tab kaam ayega jab client side mein aur requests kar raha ho jaise random rabbit toh mang hi raha hai && rabbit should be young male
        //call.parameters["rabbitId"]   -> Abhi ke liye sub quesries nahi rakh rahe par ek din ye bhi kar lenge
        call.respond(//ye saari cheezein hum usko wapas karenge
            HttpStatusCode.OK,//bata do usko request sahi gayi
            rabbits.random()
        )
    }

}