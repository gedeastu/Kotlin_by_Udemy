package com.example.byUdemy.programming

fun main(args: Array<String>) {
    var lakersScore:Int = 200;
    var bostonScore:Int = 210;
    var clippersScore:Int = 180;
    var miamiScore:Int = 190;
    // &&
    if (bostonScore > lakersScore && miamiScore > clippersScore){
        println("The final are $bostonScore vs $miamiScore")
    }else{
        println("The final are not found")
    }

    // ||
    if (bostonScore > lakersScore || miamiScore > clippersScore){
        println("The final are $bostonScore vs $miamiScore")
    }else{
        println("The final are not found")
    }
}