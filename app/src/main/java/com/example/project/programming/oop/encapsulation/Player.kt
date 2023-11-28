package com.example.project.programming.oop.encapsulation

class Player{
    var name:String? =  null
    var age:Int? = null
    var skill:String? = null
        private set
                get
    var power:Int? = null
        private set
                get
    constructor(name: String?, age: Int?, skill: String?, power: Int?) {
        this.name = name
        this.age = age
        this.skill = skill
        this.power = power
    }
}