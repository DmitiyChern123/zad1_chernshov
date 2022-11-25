package com.bignerdranch.android.zd1_chernshov

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class screen2 : AppCompatActivity() {
    lateinit var txt1: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
        var txt = findViewById<TextView>(R.id.Text2)
       var c = getIntent()getStringExtra("log")
        var p = getIntent().getStringExtra("pas")

        txt.text = " log:${c} \n pas  :${p}"

    }
}