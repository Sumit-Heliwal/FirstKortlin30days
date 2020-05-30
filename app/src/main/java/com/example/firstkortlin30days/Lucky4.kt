package com.example.firstkortlin30days

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_lucky4.*

class Lucky4 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky4)

        val players =findViewById<TextView>(R.id.name)
        val score =findViewById<TextView>(R.id.Score)
        val numberout =findViewById<TextView>(R.id.output)
        val less =findViewById<Button>(R.id.less)
        val equal =findViewById<Button>(R.id.equal)
        val greater =findViewById<Button>(R.id.greater)
        val reset =findViewById<Button>(R.id.reset)

        var scoreis = 0
        var output = 0

        val playname = intent.getStringExtra("name")
        players.text = playname
        numberout.text = "Number = $output"


        reset.setOnClickListener{
            scoreis = 0
            score.text = "Score =$scoreis"
        }
        less.setOnClickListener {
            output = RollDice()
            numberout.text = "Number = $output"
            if (output < 4){
                scoreis++
            }
            score.text = "Score =$scoreis"
        }
        equal.setOnClickListener {
            output = RollDice()
            numberout.text = "Number = $output"
            if (output == 4){
                scoreis++
            }
            score.text = "Score =$scoreis"
        }
        greater.setOnClickListener {
            output = RollDice()
            numberout.text = "Number = $output"
            if (output > 4){
                scoreis++
            }
            score.text ="Score =$scoreis"
        }
    }
}