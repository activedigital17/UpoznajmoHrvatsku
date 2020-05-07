package com.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import kotlinx.android.synthetic.main.activity_facts.*
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class Facts : AppCompatActivity() {

    val URL = "https://kvizapic.herokuapp.com/random"
    var okHttpClient:OkHttpClient = OkHttpClient()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facts)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        nextQuoteBtn.setOnClickListener {
            loadRandomFact()
        }

        shareBtn.setOnClickListener {
            shareFact()
        }



    }


    private fun loadRandomFact(){


        val request:Request=Request.Builder().url(URL).build()
        okHttpClient.newCall(request).enqueue(object:Callback{
            override fun onFailure(call: Call, e: IOException) {
                quote_tv.text = e.toString()
            }

            override fun onResponse(call: Call, response: Response) {
                val json= response.body()?.string()
                val txt=(JSONObject(json!!).get("fact").toString())

                runOnUiThread { quote_tv.text = Html.fromHtml(txt) }

            }
        })
    }


    private fun shareFact(){

        val dataFromQuoteView:String = quote_tv.text.toString()

        val sendIntent:Intent = Intent().apply {
            action=Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, dataFromQuoteView )
            type="text/plain"

        }

        val shareIntent = Intent.createChooser(sendIntent,null)
        startActivity(shareIntent)

    }
}
