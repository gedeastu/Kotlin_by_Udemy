package com.example.byUdemy.programming.oop.constructor

class Doctor{
    var name:String? = null
    var age:Int? = null
    var specialist:String? = null

    constructor(name: String?, age: Int?, specialist: String?) {
        this.name = name
        this.age = age
        this.specialist = specialist
    }
}