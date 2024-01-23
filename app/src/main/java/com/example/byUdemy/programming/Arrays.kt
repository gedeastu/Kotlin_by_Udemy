package com.example.project.programming


fun main(args: Array<String>) {

    //Array
    val numberPlayerBasketBall:Array<Int> = arrayOf(23,6,16,17,8,24,4,33)
    val namePlayerBasketBall:Array<String> = arrayOf("Jordan","Bill Russell","Karl Malone","Iverson","Lavine","Kobe Bryant","Tim Duncan","Robinson")

    //set()
    namePlayerBasketBall.set(2,"Rodman")

    //get()
    println(namePlayerBasketBall.get(2))

    //size
    println(namePlayerBasketBall.size)
}