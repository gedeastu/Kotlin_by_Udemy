package com.example.byUdemy.programming

fun main(args: Array<String>) {

    //ArrayList
    var tradeListPlayer : ArrayList<String> = ArrayList()

    //add
    tradeListPlayer.add("James Harden")
    tradeListPlayer.add("Lebron James")

    //size
    println("${tradeListPlayer.get(1)}")
    println(tradeListPlayer.size)

    //removeAt for index
    tradeListPlayer.removeAt(0)
    println(tradeListPlayer.size)

    //remove for element
    tradeListPlayer.remove("Lebron James")

    //Show Array element
    println(tradeListPlayer)


    println("\n")


    //ArrayListOf
    var playOff : ArrayList<String> = arrayListOf("Boston","Lakers","GSW","Bulls","Spurs")

    //size
    println(playOff.size)

    //remove for element
    playOff.remove("GSW")

    //add
    playOff.add("OKC")

    //removeAt for index
    playOff.removeAt(1)

    //show the arrayListOf element
    println(playOff)

}