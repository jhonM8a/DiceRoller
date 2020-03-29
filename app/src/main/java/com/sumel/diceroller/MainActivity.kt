package com.sumel.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{
            /*Esto muestra un popup corto en la actividad indicada
            Toast.makeText(this, "button Clicked", Toast.LENGTH_SHORT).show()}
            */
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText : TextView = findViewById(R.id.restult_text)
        val ramdomInt = Random().nextInt(6)+1
        resultText.text =  ramdomInt.toString()
    }
}
