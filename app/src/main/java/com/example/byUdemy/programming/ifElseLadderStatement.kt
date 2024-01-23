package com.example.project.programming

fun main(args: Array<String>) {
    print("Lakers : ")
    var scoreLakers:Int = readLine()!!.toInt()

    print("Celtics : ")
    var scoreBoston:Int = readLine()!!.toInt()

    if(scoreLakers > scoreBoston){
        println("Lakers win!")
    }else{
        if (scoreLakers < scoreBoston){
            println("Celtics win")
        }
        if (scoreLakers == scoreBoston){
            println("Overtime!")
        }
    }
}