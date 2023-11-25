package com.example.project.programming

fun main(args: Array<String>) {
    val name:String = "Gede Astu Nugraha"
    val location:String = "Bali"
    println("$name from $location")


    //trim() Method
    println(name.trim())
    println(name.trim() + " with length " + name.trim().length)

    //length Method
    val lengthMyName = name.length
    println(lengthMyName)

    //equals Method
    val equalsLocation = location.equals("Java")
    println(equalsLocation)

    //plus Method
    println(name.plus(19))

    //lowercase Method
    println(name.lowercase())

    // uppercase Method
    println(name.uppercase())

}