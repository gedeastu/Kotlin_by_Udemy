package com.example.project.programming.oop.overriding

class Paracetamol : Medical() {
    override fun pickUp(nameMedic : String){
        println("The $nameMedic Medical ready to pick-up")
    }

    override fun gramDosis(dosis : String){
        println("with $dosis")
    }

    override  fun process(status : String){
        println("Medical status is $status")
    }
}