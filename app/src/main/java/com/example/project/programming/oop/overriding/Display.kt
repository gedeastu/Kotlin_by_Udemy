package com.example.project.programming.oop.overriding

fun main(args: Array<String>) {
    val medical = Medical()
    val paracetamol = Paracetamol()

    medical.pickUp("Panadol")
    medical.process("Not Yet")
    medical.gramDosis("100gram")

    println("\n")

    paracetamol.pickUp("Paracetamol")
    paracetamol.process("Ready")
    paracetamol.gramDosis("400gram")
}
