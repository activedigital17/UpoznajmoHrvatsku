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
            "Tko je bio prvi predsjednik Vlade nakon prvih demokratskih izbora 1990. godine?",
            "Stipe Mesić",
            "Milka Planinc",
            "Gojko Šušak",
            "Nikica Valentić",
            1)

        //dodajemo pitanja na Arraylistu
        questionList.add(q1)

        val q2 = Questions(
            2,
            "Koliko je zlatnih olimpijskih medalja osvojila Janica Kostelić?",
            "Dvije",
            "Četiri",
            "Šest",
            "Osam",
            2)

        questionList.add(q2)


        val q3 = Questions(
            3,
            "Kada je uvedena hrvatska valuta kuna? ",
            "1990. godine",
            "1992. godine",
            "1994. godine",
            "1995. godine",
            3)

        questionList.add(q3)

        val q4 = Questions(
            4,
            "Tko je izrekao: Tko je jamio - jamio, što najbolje opisuje hrvatsku privatizaciju?",
            "Ljubo Ćesić Rojs",
            "Marin Jurjević Baja",
            "Ante Čičin Šain",
            "Ljubo Jurčić",
            1)

        questionList.add(q4)

        val q5 = Questions(
            5,
            "Koja je država prva priznala Hrvatsku?",
            "Velika Britanija",
            "Island",
            "Njemačka",
            "Vatikan",
            3)

        questionList.add(q5)


        val q6 = Questions(
            6,
            "Koji je hrvatski film najgledaniji?",
            "Kako je počeo rat na mom otoku",
            "Duga mračna noć",
            "Ajmo, žuti",
            "Kapelski kresovi",
            1)

        questionList.add(q6)

        val q7 = Questions(
            7,
            "Koliko je puta Franjo Tuđman pobijedio na predsjedničkim izborima?",
            "Jednom",
            "Dva puta",
            "Tri puta",
            "Nikada",
            2)

        questionList.add(q7)



        //objekt vraća listu
        return questionList


    }



}