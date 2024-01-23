package com.example.project.programming

fun main(args: Array<String>) {
    var Boston:String = "Boston Celtics"
    var Lakers:String = "LA Lakers"

    var BostonScore:Int = 120
    var LakersScore:Int = 100
    //==
    if(Boston == Lakers){
        println("The Winner is $Boston")
    }else{
        println("The Winner is $Lakers")
    }
    //!=
    if(Boston != Lakers){
        println("The Winner is $Boston")
    }else{
        println("The Winner is $Lakers")
    }
    //>
    if(BostonScore > LakersScore){
        println("The Winner is $Boston")
    }else{
        println("The Winner is $Lakers")
    }
    //<
    if(BostonScore < LakersScore){
        println("The Winner is $Boston")
    }else{
        println("The Winner is $Lakers")
    }
    //>=
    if(BostonScore >= LakersScore){
        println("The Winner is $Boston")
    }else{
        println("The Winner is $Lakers")
    }
    //<=
    if(BostonScore <= LakersScore){
        println("The Winner is $Boston")
    }else{
        println("The Winner is $Lakers")
    }
}