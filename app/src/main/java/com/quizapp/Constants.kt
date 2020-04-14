package com.quizapp

import android.util.Log

object Constants{

    //placeholderi koji se koriste kasnije u intentu tj prijalazu iz jednog na drugi
    const val TOTAL_QUESTIONS:String= "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"


    fun getQuestions():ArrayList<Questions>{

        //array za pitanja
        val questionList = ArrayList<Questions>()


        //pitanja
        val q1 = Questions(
            1,
            "Prije nego što krenemo, da ne bude baš da ignoriramo svih 428 općina, pitamo koja je od\n" +
                    "njih najmnogoljudnija? Prema popisu iz 2001. ima 14.445 stanovnika, odnosno gotovo\n" +
                    "13.500 više nego grad s najmanje stanovnika?",
            "Opatija",
            "Ozalj",
            "Koprivnica",
            "Viškovo",
            4)

        //dodajemo pitanja na Arraylistu
        questionList.add(q1)

        val q2 = Questions(
            2,
            "Od Ante Starčevića do Nikole Tesle, na širem području ovog grada rođeni su mnogi\n" +
                    "velikani, što nije ni čudno, jer prostire se na površini većoj od Pariza!\n",
            "Pakrac",
            "Slatina",
            "Gospić",
            "Bakar",
            3)

        questionList.add(q2)


        val q3 = Questions(
            3,
            "Bura živi u Rijeci, umire u Trstu, a gdje se rađa? ",
            "Varaždin",
            "Ozalj",
            "Ozalj",
            "Senj",
            4)

        questionList.add(q3)

        val q4 = Questions(
            4,
            "U središtu kojeg hrvatskog grada se nalaze koncentrični krugovi s natpisom Centrum\n" +
                    "Mundi?\n",
            "Ludbreg",
            "Belišće",
            "Imotski",
            "Rovinj",
            1)

        questionList.add(q4)



        //objekt vraća listu
        return questionList


    }



}