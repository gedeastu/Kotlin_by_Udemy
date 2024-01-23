package com.example.byUdemy.programming

import kotlin.random.Random

fun main(args: Array<String>) {

    //While Loop
    var i =  1
    var fact = 1
    while (i < 10){
        fact *= i
        println("$i! = $fact")
        i++
    }

    var reverse:Int = 10
    while (reverse > 0){
        reverse--
        println(reverse)
    }

    //Infinite Loop
    var RandomPoint = Random.nextInt(1,3)

    while (1 < 2){

        println("Please guess point gonna be : ")
        val shoot:Int = readLine()!!.toInt()

        if(RandomPoint == shoot && RandomPoint == 3){

            println("Congratulations You get the 3 point")
            break

        }else if (RandomPoint == shoot && RandomPoint == 2){

            println("Wow You get the 2 point")
            println("Please guess point gonna be : ")
            val shoot:Int = readLine()!!.toInt()

        }else{

            println("It's Okay You get the 1 point")

            print("Try Again : ")
            val tryAgain:String = readLine()!!.toString()
            when(tryAgain){
                "Yes" -> ' '
                "No" -> break
            }

        }
    }
}