package com.fourcircles

import java.util.*

fun sum(a: IntArray): Int {
    // Write your solution here
    var totalSum = 0
    a.forEach {
        totalSum =totalSum +it
    }
    return totalSum
}
fun main() {
//    if (args.size == 0) {
//        println("Please provide a name as a command-line argument")
//        return
//    }
//    val intArray: IntArray = [1 2 5]
//    println(sum(intArray))
//    println(sum(intArray))
    val nums3 = IntArray(5, { i -> i * 2 + 3})
    println(Arrays.toString(nums3))
    println(sum(nums3))
//    println("Hello, ${args[0]}!")
}