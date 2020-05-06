package com.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {

        public var level:String? = null

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // skrivamo status bar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        //start tipka listener
        btn_start.setOnClickListener {
            if (et_name.text.toString().isEmpty()){
                //test jel prazan et
                Toast.makeText(this,"Ime nije uneseno!", Toast.LENGTH_LONG).show()
            } else{
                //prijelaz na novi activity Quiz Questions
                val intent = Intent(this,SplashScreenLeveloneActivity::class.java)
                startActivity(intent)
                MainActivity.level = "one"
                finish()


            }

        }

        factsBtn.setOnClickListener{


            val intent = Intent(this,Facts::class.java)
            startActivity(intent)

        }



    }
}