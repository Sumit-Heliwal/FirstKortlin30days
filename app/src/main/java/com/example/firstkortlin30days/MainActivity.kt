package com.example.firstkortlin30days

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val but = findViewById<Button>(R.id.button)
        val outtext = findViewById<TextView>(R.id.output)
        val comp = findViewById<Button>(R.id.compare)



        but.setOnClickListener { 
            outtext.text= """Number =${RollDice()}"""
        }
        comp.setOnClickListener {
            val intent = Intent( this , NameInputList::class.java)
            startActivity(intent)

        }
    }


}

