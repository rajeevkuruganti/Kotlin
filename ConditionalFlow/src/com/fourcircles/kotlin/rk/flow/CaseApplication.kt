package com.fourcircles.kotlin.rk.flow

fun main() {
    val x = 235
    var result  = when (x%2){
         0 ->  "even number"
         1 ->   "number odd"
        else ->  "error"
    }
    println(result)
}