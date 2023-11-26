package com.example.project.programming

fun main(args: Array<String>) {
    print("Find the club with ranking!! ")
    var klasemen:Int = readLine()!!.toInt()
    var club:String

    when(klasemen){
        1 -> club = "Bucks"
        2 -> club = "Boston"
        3 -> club = "Sixers"
        4 -> club = "Cleveland"
        5 -> club = "Knicks"
        6 -> club = "Nets"
        7 -> club = "Hawks"
        else -> club = "Nothing here"
    }

    println("The Ranking $klasemen is $club club")
}