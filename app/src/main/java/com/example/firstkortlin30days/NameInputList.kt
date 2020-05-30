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


        var players =findViewById<EditText>(R.id.name)
        var lucky =findViewById<Button>(R.id.lucky)
        var luck =findViewById<Button>(R.id.luck)
        var twodice =findViewById<Button>(R.id.twodice)

        fun getName(): Editable? {
            return players.text
        }
        lucky.setOnClickListener {
            var intent = Intent( this , NameInputList::class.java)
            intent.putExtra( "name" , getName())
            startActivity(intent)

        }
        luck.setOnClickListener {
            var intent = Intent( this , NameInputList::class.java)
            intent.putExtra( "name" , getName())
            startActivity(intent)

        }
        twodice.setOnClickListener {
            var intent = Intent( this , NameInputList::class.java)
            intent.putExtra( "name" , getName())
            startActivity(intent)

        }


    }

}
