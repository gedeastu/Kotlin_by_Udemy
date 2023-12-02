package com.example.project.programming.oop.interfaces

fun main(args: Array<String>) {
    var games = Games()
    println(games.nameGame)
    println(games.version)
    var update = games.update()
    println("${update}")
}