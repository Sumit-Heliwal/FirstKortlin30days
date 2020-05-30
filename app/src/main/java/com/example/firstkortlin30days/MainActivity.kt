package com.example.firstkortlin30days

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var but = findViewById<Button>(R.id.button)
        var outtext = findViewById<TextView>(R.id.output)
        var comp = findViewById<Button>(R.id.compare)



        but.setOnClickListener { 
            outtext.text= "Number ="+outputNumber()
        }
        comp.setOnClickListener {
            var intent = Intent( this , NameInputList::class.java)
            startActivity(intent)

        }
    }
    fun outputNumber(): Int? {
        return rand(1,6)
    }

    fun rand(start: Int, end: Int): Int {
        require(!(start > end || end - start + 1 > Int.MAX_VALUE)) { "Illegal Argument" }
        return Random(System.nanoTime()).nextInt(end - start + 1) + start
    }

}

