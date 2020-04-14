package com.quizapp

//data klasa za kreiranje pitanja
data class Questions(val id:Int,
                     val question:String,
                     val optionOne:String,
                     val optionTwo:String,
                     val optionThree:String,
                     val optionFour:String,
                     val correctAnswer:Int)