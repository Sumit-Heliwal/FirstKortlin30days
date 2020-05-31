package com.example.firstkortlin30days

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText

class NameInputList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_input_list)


        val players =findViewById<EditText>(R.id.name)
        val lucky =findViewById<Button>(R.id.lucky)
        val luck =findViewById<Button>(R.id.luck)
        val twodice =findViewById<Button>(R.id.twodice)


        lucky.setOnClickListener {
            val intent = Intent( this , Lucky4::class.java)
            intent.putExtra( "name" , players.text.toString())
            startActivity(intent)

        }
        luck.setOnClickListener {
            val intent = Intent( this , CompareLuck::class.java)
            intent.putExtra( "name" , players.text.toString())
            startActivity(intent)

        }
        twodice.setOnClickListener {
            val intent = Intent( this , Compare2Dice::class.java)
            intent.putExtra( "name" , players.text.toString())
            startActivity(intent)

        }


    }

}
