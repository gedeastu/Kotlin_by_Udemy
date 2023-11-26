package com.example.project.programming

fun main(args: Array<String>) {

    var multipleSpeed:Int = 2
    for (speed in 1..10){
        multipleSpeed *= speed
        if (multipleSpeed > 5){
            println("Your speed ${multipleSpeed} is so fast")

        }else{
            println("Your speed ${multipleSpeed} is so slow")
        }
    }

    var sum:Int = 0
    for (number in 0..10){
        if (number % 2 == 0){
            println(number)
            sum += number
        }
    }
    println(sum)

    var sportCars:ArrayList<String> = arrayListOf("Bugatti","Lamborghini","Benz","BMW")

    for (car in sportCars){
        println(car)
    }

    for (numberCar in sportCars.indices){
        println("sportCars Array[$numberCar] = ${sportCars[numberCar]}")
    }

    sportCars.forEach{
        println("sportCars Array[$it] = ${it}")
    }
}
