package com.example.project.programming.oop.inheritance

fun main(args: Array<String>) {
    var batman = Batman()
    batman.name = "Batman"
    batman.age = 19
    batman.location = "Gotham"
    batman.damage(3000.0)
    batman.defense(1000.0)
}