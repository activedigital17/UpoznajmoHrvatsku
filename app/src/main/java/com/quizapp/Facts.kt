package com.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import kotlinx.android.synthetic.main.activity_facts.*
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class Facts : AppCompatActivity() {

    val URL = "https://api.icndb.com/jokes/random"
    var okHttpClient:OkHttpClient = OkHttpClient()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facts)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        nextQuoteBtn.setOnClickListener {
            loadRandomFact()
        }

    }


    private fun loadRandomFact(){


        val request:Request=Request.Builder().url(URL).build()
        okHttpClient.newCall(request).enqueue(object:Callback{
            override fun onFailure(call: Call, e: IOException) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call, response: Response) {
                val json= response.body()?.string()
                val txt=(JSONObject(json!!).getJSONObject("value").get("joke")).toString()

                runOnUiThread { quote_tv.text = Html.fromHtml(txt) }

            }
        })
    }
}
