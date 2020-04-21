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


        val q8 = Questions(
            8,
            "Tko je najpopularniji i najpoznatiji hrvatski znanstvenik?",
            "Miroslav Radman",
            "Anto Đapić",
            "Dragan Primorac",
            "Ivan Đikić",
            1)

        questionList.add(q8)


        val q9 = Questions(
            9,
            "Koliko je puta papa Ivan Pavao II. bio u Hrvatskoj",
            "Jednom",
            "Tri puta",
            "Pet puta",
            "Nikada",
            2)

        questionList.add(q9)


        val q10 = Questions(
            10,
            "Gdje je rođen zagrebački gradonačelnik Milan Bandić?",
            "U Zagrebu",
            "U Imotskom",
            "U Hercegovini",
            "U Zagorju",
            3)

        questionList.add(q10)

        val q11 = Questions(
            11,
            "Koje se mjesto nalazi na Balkanskom poluotoku?",
            "Dubrovnik",
            "Kumrovec",
            "Vukovar",
            "Pula",
            1)

        questionList.add(q11)


        val q12 = Questions(
            12,
            "Tko je bio kapetan reprezentacije Hrvatske na prvoj utakmici u Maksimiru protiv SAD-a?",
            "Cico Kranjčar",
            "Zoran Vulić",
            "Marko Mlinarić",
            "Davor Šuker",
            1)

        questionList.add(q12)

        val q13 = Questions(
            13,
            "U kojoj su županiji Plitvička jezera?",
            "Karlovačkoj",
            "Zagorskoj",
            "Ličko-senjskoj",
            "Primorsko-goranskoj",
            3)

        questionList.add(q13)


        val q14 = Questions(
            14,
            "Kako glasi službeni slogan Hrvatske turističke zajednice?",
            "Mediteran kakav je nekada bio",
            "Mala zemlja za veliki odmor",
            "Najljepša zemlja, najpametniji ljudi",
            "Zemlja 1000 otoka",
            1)

        questionList.add(q14)

        val q15 = Questions(
            15,
            "Tko nije bio hrvatski premijer?",
            "Josip Manolić",
            "Vladimir Šeks",
            "Zoran Milanović",
            "Hrvoje Šarinić",
            2)

        questionList.add(q15)

        val q16 = Questions(
            16,
            "Koga je kardinal Bozanić naslijedio na čelu Zagrebačke nadbiskupije?",
            "kardinala Franju Kuharića",
            "kardinala Vinka Puljića",
            "kardinala Franju Šepera ",
            "kardinala Alojzija Stepinca",
            1)

        questionList.add(q16)


        val q17 = Questions(
            17,
            "Koji je političar bio premijer, predsjednik Sabora i predsjednik države?",
            "Stipe Mesić",
            "Ivo Sanader",
            "Petar Čobanković",
            "Zoran Milanović",
            1)

        questionList.add(q17)

        //objekt vraća listu
        return questionList


    }



}