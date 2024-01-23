package com.example.project.programming.oop.interfaces

class Games : Update,Delete{
    override val version: String
        get() = "5.9.0"

    override fun update() {
        super.update()
    }
    override fun delete() {
       println("The App is going deleting")
    }

    override val nameGame: String
        get() = super.nameGame
}