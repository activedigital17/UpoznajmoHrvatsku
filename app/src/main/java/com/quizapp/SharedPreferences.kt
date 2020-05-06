package com.quizapp

import android.content.Context
import android.content.SharedPreferences

class SharedPreferences(val context:Context) {

    private val PREFS_NAME = "highscore"
    val sharedPref: SharedPreferences? = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun save(KEY_NAME: String, value: Int) {
        val editor: SharedPreferences.Editor = sharedPref!!.edit()

        editor.putInt(KEY_NAME, value)

        editor.commit()
    }

    fun getValueInt(KEY_NAME: String): Int {

        return sharedPref!!.getInt(KEY_NAME, 0)
    }
}