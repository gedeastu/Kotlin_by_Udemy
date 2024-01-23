package com.example.byUdemy.programming

fun main(args: Array<String>) {
    print("how many Speed you got ?")
    val speedDefault:Double = readLine()!!.toDouble()
     if(speedDefault > 3500.00 ){
         println("Fast!, Speed you got is $speedDefault")
     }else{
         println("Slow, Speed you got is $speedDefault")
     }
}