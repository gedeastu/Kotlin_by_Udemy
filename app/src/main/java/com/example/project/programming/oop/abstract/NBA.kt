package com.example.project.programming.oop.abstract

abstract class NBA {
    //Abstract Fun
    abstract fun clubName(name:String):String

    //Non-Abstract Fun
    fun lineUp(countPlayer:Int):Int{
        return countPlayer
    }

    //Abstract Fun
    abstract var champClub : Int

    //Non-Abstract Fun
    var lastYearChamp : Int? = null
}