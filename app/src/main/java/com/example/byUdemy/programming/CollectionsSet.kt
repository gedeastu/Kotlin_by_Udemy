package com.example.project.programming

fun main(args: Array<String>) {

    //if with arrayList
    var myChar : ArrayList<String> = ArrayList()
    myChar.add(0,"Amy")
    myChar.add(1, "Brooke")
    myChar.add(2,"Henderson")
    println(myChar.last())

    //if with setOf
    //setOf for make the element is not gonna duplicate when the element is has same value
    var myCar : Set<String> = setOf("Ford","Bugatti", "Ford" ,"Labhorgini","BMW","Labhorgini")
    println(myCar.first())
    println(myCar.last())
    println(myCar)
}