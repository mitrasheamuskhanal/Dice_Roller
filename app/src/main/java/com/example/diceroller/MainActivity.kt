package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rbutton : Button = findViewById(R.id.Roll_button)
         rbutton.setOnClickListener {
             roll_dice()
         }
    }

    private fun roll_dice() {
       val result : TextView = findViewById(R.id.result)
        val randonInt = Random().nextInt(6 ) +1
        result.text = randonInt.toString()
    }
}