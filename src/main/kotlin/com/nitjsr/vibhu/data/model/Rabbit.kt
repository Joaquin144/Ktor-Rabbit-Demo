package com.nitjsr.vibhu.data.model

import kotlinx.serialization.Serializable

//data classes are serialized(E! -> POJO types hai kya??) so as to parse their content as JSON
@Serializable
data class Rabbit(
    val name:String,
    val description: String,
    val imageUrl: String
)
