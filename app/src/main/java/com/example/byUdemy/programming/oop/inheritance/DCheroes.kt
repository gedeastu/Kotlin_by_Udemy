package com.example.project.programming.oop.inheritance

open class DCheroes {
    var name:String? = null
    var age:Int? = null
    var location:String? = null
    var damage:Double? = null
    var defense:Double? = null
    //val skill = Skill(damage,defense)
    fun damage(damage:Double){
        //this.damage = skill.damage
        println("the damage $damage by $name from $location is Strong")
    }

    fun defense(defense:Double){
        //this.defense = skill.defense
        println("the defense $defense by $name from $location is Strong")
    }

}