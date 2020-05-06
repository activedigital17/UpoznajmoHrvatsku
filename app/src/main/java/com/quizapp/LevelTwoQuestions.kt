package com.quizapp

import java.util.ArrayList

object LevelTwoQuestions {


    const val TOTAL_QUESTIONS:String = "total questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions(): ArrayList<Questions>? {

        val questionsList = ArrayList<Questions>()

        val q1 = Questions(1,"halo","fd","fds","gfsd","dsa",2)

        questionsList.add(q1)

        return questionsList
    }


}