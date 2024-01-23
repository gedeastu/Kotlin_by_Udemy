package com.example.project.programming.oop.overriding

open class Medical {
    open fun pickUp(nameMedic : String){
        println("The $nameMedic Medical ready to pick-up")
    }

    open fun gramDosis(dosis : String){
        println("with $dosis")
    }

    open fun process(status : String){
        println("Medical status is $status")
    }

}