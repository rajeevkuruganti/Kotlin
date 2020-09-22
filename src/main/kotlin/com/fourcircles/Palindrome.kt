package com.fourcircles

fun isPalindrome(s: String): Boolean {
    var stringChar = s.toCharArray()
    var reverseString = ""
    val reverses1 = s.reversed()
    var i = 0
    for (i in s.length-1 downTo 0) {
        reverseString = reverseString + s[i]
    }
    println(s + " and reverse String is " + reverseString)
    if (s.equals(reverses1))
        return true
    return false
}

fun main() {
    val word1 = "dear"
    val word2 = "rotor"
    val word3 = "immediate"
    println(word1 + " is palindrome - " + isPalindrome(word1))
    println(word2 + " is palindrome - " + isPalindrome(word2))
    println(word3 + " is palindrome - " + isPalindrome(word3))
//    val nums3 = IntArray(5, { i -> i * 2 + 3})
//    println(Arrays.toString(nums3))
//    println(sum(nums3))
//    println("Hello, ${args[0]}!")
}