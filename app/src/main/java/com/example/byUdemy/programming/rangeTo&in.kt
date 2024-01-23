package com.example.project.programming

fun main(args: Array<String>) {
    var speed = 1.rangeTo(10)
    var gear = 1..6

    if(8 in speed){
        println("The Speed is FAST")
    }else{
        println("The Speed is has SLOW")
    }
}