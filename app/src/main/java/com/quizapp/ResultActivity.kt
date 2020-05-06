package com.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_IMMERSIVE
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val totalQuestions = intent.getIntExtra(LevelOneQuestions.TOTAL_QUESTIONS, 0)
        val correctQuestions = intent.getIntExtra(LevelOneQuestions.CORRECT_ANSWERS, 0)


        //spremanje highscorea
        //treba ispraviti prikaz ukupnog po pojedinačnom aktivitiju
        val sharedPreference: com.quizapp.SharedPreferences = SharedPreferences(this)

        if (correctQuestions>sharedPreference.getValueInt("highscore")){

            sharedPreference.save("highscore", correctQuestions)
        }


        correct_answers_display.text = "$correctQuestions/$totalQuestions"


        highscore_tv.text = "${sharedPreference.getValueInt("highscore")}/$totalQuestions je tvoj najbolji rezultat, probaj ga sustići.  "

        if (correctQuestions > 1){


            playAgain_btn.text = "Nastavi"
            MainActivity.level = "two"
        } else {

            playAgain_btn.text ="Igraj Ponovno"
            MainActivity.level = "one"
        }


        resultFinish_btn.setOnClickListener() {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()


        }

        playAgain_btn.setOnClickListener() {


            if(correctQuestions>1){

                val intent = Intent(this, splash_screen_leveltwo::class.java)
                startActivity(intent)
                finish()


            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }



        }


    }
}