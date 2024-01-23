package com.example.byUdemy.programming.oop.abstract

class Club(override var champClub: Int) : NBA() {
    override fun clubName(name: String): String {
        return name
    }

}