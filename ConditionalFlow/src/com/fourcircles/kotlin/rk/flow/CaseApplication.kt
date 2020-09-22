package com.fourcircles.kotlin.rk.flow

fun main() {
    val name="Inigo"
    when (name){
         "David" -> println(name)
         "Inigo" -> println(name)
    }
   val  city = "Denver"
    when (city){
        "Denver" -> println(city)
        "Monroe" -> println(city)
        else -> println("this has no case")
    }


    val x = 235


    var result  = when (x%2){
         0 ->  "even number"
         1 ->   "number odd"
        else ->  "error"
    }
    println(result)
}