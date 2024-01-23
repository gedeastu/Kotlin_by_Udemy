package com.example.byUdemy.programming.oop.constructor

fun main(args: Array<String>) {
    var medic = Medic()
    medic.name = "Paracetamol"
    medic.brand = "Bayern"
    println(medic.name)

    var patient = Patient("Puspita",19)
    patient.age = 20
    println(patient.age)

    var doctor = Doctor("Astu",19,"Umum")
    doctor.name = "Gede Astu"
    doctor.age = 20
    println(doctor.name)
}