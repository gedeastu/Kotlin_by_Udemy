package com.example.byUdemy.programming

fun main(args: Array<String>) {

    var speed:Double = 90.00
    val isCheck:Boolean = true

    //+nameVariable
    println(+speed)

    //-nameVariable
    println(-speed)

    //++nameVariable
    println(++speed)

    //--nameVariable
    println(--speed)

    //!nameVariable
    println("${
        if(speed == 90.00) println("the speed is $isCheck") else println(!isCheck)
    }")

    println("\n")

    // Prefix => ++nameVariable,
    println(++speed)
    println(speed)

    // and Suffix => nameVariable++
    println(speed++)
    println(speed)
}