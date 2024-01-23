package com.example.byUdemy.programming

fun main(args: Array<String>) {
    println("Please enter your number : ")
    val number1:Int = readLine()!!.toInt()
    val number2:Int = readLine()!!.toInt()
    show(number1,number2)
    println("You add ${add(number1,number2)}")
    println("the minimum number is ${findMinimumNumber(number1,number2)}")
    findMinimumNumber(number1,number2)
}
//Standard Library Funtions

//User-Defined Functions

//Unit -> Void
fun show(num1:Int, num2:Int){
    println("You Entered $num1 and $num2")
}

//function with return and type function
fun add(num1:Int,num2:Int):Int{
    var sum:Int = 0
    sum = num1 + num2;
    return sum
}

//
fun findMinimumNumber(num1:Int,num2: Int):Int{
    var minimum:Int
    if (num1 > num2){
        minimum = num2
    }else{
        minimum = num1
    }
    return minimum
}

