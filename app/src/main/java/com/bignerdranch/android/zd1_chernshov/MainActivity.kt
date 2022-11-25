package com.bignerdranch.android.zd1_chernshov

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var log:EditText
    lateinit var pas:EditText
    lateinit var t1:TextView

    val APP_PREFERENCES = "mysettings"
    val APP_PREFERENCES_NAME = "log"

    val APP_PREFERENCES_AGE = "pas"




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var t1 = findViewById<TextView>(R.id.t1)
        var log1 = findViewById<EditText>(R.id.Log)
        var pas1 = findViewById<EditText>(R.id.Pas)
      var Nlog = "admin";
        var NPas = "admin";
        var mSettings: SharedPreferences
        mSettings = getSharedPreferences(APP_PREFERENCES,MODE_PRIVATE);

        val editor: SharedPreferences.Editor = mSettings.edit()
        editor.putString(APP_PREFERENCES_NAME, Nlog)
        editor.apply()

        val editor1: SharedPreferences.Editor = mSettings.edit()
        editor1.putString(APP_PREFERENCES_AGE, NPas)
        editor1.apply()
    }

    fun LogClick(view: View) {
        var log1 = findViewById<EditText>(R.id.Log)
        var pas1 = findViewById<EditText>(R.id.Pas)
        if (log1.text.toString()=="admin" || pas1.text.toString()=="admin"){


            var intent = Intent(this,screen2::class.java)
            intent.putExtra("pas", pas1.text.toString())
            intent.putExtra("log",log1.text.toString())

            startActivity(intent)
        }



    }

    fun check(view: View) {
        lateinit var but:Button
        var bb = findViewById<Button>(R.id.b1)

        var sp = getSharedPreferences("APP_PREFERENCES_AGE",MODE_PRIVATE)
        var txt1 = sp.getString("APP_PREFERENCES_AGE",APP_PREFERENCES_AGE);
        var txt2 = sp.getString("APP_PREFERENCES_AGE",APP_PREFERENCES_AGE);
        bb.text = "${txt1.toString()} \n ${txt2.toString()}"
    }
}