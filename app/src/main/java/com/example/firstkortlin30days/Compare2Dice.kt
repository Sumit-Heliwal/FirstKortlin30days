package com.example.firstkortlin30days

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Compare2Dice : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compare2_dice)

        val players =findViewById<TextView>(R.id.name)
        val score =findViewById<TextView>(R.id.score)
        val output2 =findViewById<TextView>(R.id.dice1)
        val output1 =findViewById<TextView>(R.id.dice2)
        val play =findViewById<Button>(R.id.play)
        val reset =findViewById<Button>(R.id.reset)

        var scoreis = 0
        var outputd1 = 0
        var outputd2 = 0

        val playname = intent.getStringExtra("name")
        players.text = playname
        output1.text = "Number = $outputd1"
        output2.text = "Number = $outputd2"
        score.text = "Score =$scoreis"


        reset.setOnClickListener{
            scoreis = 0
            score.text = "Score =$scoreis"
        }

        play.setOnClickListener {
            outputd1 = RollDice()
            outputd2 = RollDice()
            output1.text = "Number = $outputd1"
            output2.text = "Number = $outputd2"
            if (outputd1 == outputd2){
                scoreis++
            }
            score.text = "Score =$scoreis"
        }

    }
}