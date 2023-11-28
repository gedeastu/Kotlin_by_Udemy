package com.example.project.programming.oop.overriding

class Doxin : Medical() {
    fun pickUpSuper(){
        super.pickUp("Doxin")
    }

    fun gramDosisSuper(){
        super.gramDosis("400gram")
    }

    fun processSuper(){
        super.process("Ready")
    }

}