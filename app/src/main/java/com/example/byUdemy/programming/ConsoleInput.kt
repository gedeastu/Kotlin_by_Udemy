package com.example.byUdemy.programming

fun main(args: Array<String>) {
    print("What is your name ? ")

    var name:String? = readLine()!!

    print("How old are you ? ")

    var age:Int? = readLine()!!.toInt()

    println("He is $name in $age")
}