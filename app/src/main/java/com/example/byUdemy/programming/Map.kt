package com.example.byUdemy.programming

fun main(args: Array<String>) {
    //Immutable, it's mean, we cannot change the element later
    var listNavigation : Map<Int,String> = mapOf(1 to "Home", 2 to "About",3 to "Service", 4 to "")
    println(listNavigation.get(2))

    //mutable, it's mean, we can change the element later
    var listCard : MutableMap<Int,String> = mutableMapOf(1 to "Hello", 2 to "Welcome", 3 to "What's Up")
    println(listCard)
    listCard.put(1, "Haloo")
    println(listCard)
}
