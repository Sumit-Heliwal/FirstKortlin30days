package com.example.firstkortlin30days

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CompareLuck : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compare_luck)

        val players =findViewById<TextView>(R.id.name)
        val score =findViewById<TextView>(R.id.score)
        val outputs =findViewById<TextView>(R.id.output)
        val one =findViewById<Button>(R.id.one)
        val two =findViewById<Button>(R.id.two)
        val three =findViewById<Button>(R.id.three)
        val four =findViewById<Button>(R.id.four)
        val five =findViewById<Button>(R.id.five)
        val six =findViewById<Button>(R.id.six)
        val reset =findViewById<Button>(R.id.reset)

        var scoreis = 0
        var output = 0

        val playname = intent.getStringExtra("name")
        players.text = playname
        outputs.text = "Number = $output"
        score.text = "Score =$scoreis"


        reset.setOnClickListener{
            scoreis = 0
            score.text = "Score =$scoreis"
        }

        one.setOnClickListener {
            output = RollDice()
            outputs.text = "Number = $output"
            if (output == 1){
                scoreis++
            }
            score.text = "Score =$scoreis"
        }
        two.setOnClickListener {
            output = RollDice()
            outputs.text = "Number = $output"
            if (output == 2){
                scoreis++
            }
            score.text = "Score =$scoreis"
        }
        three.setOnClickListener {
            output = RollDice()
            outputs.text = "Number = $output"
            if (output == 3){
                scoreis++
            }
            score.text = "Score =$scoreis"
        }
        four.setOnClickListener {
            output = RollDice()
            outputs.text = "Number = $output"
            if (output == 4){
                scoreis++
            }
            score.text = "Score =$scoreis"
        }
        five.setOnClickListener {
            output = RollDice()
            outputs.text = "Number = $output"
            if (output == 5){
                scoreis++
            }
            score.text = "Score =$scoreis"
        }
        six.setOnClickListener {
            output = RollDice()
            outputs.text = "Number = $output"
            if (output == 6){
                scoreis++
            }
            score.text = "Score =$scoreis"
        }

    }
}