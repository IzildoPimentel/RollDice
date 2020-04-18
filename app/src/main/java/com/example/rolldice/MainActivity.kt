package com.example.rolldice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Layouts
        val resultText: TextView = findViewById(R.id.rnd_number)
        val rollButton: Button = findViewById(R.id.roll_button)
        val resetButton: Button = findViewById(R.id.reset_button)

        // OnClick roll the dice
        rollButton.setOnClickListener { rollDice(resultText) }

        // OnClick reset the dice
        resetButton.setOnClickListener { resetDice(resultText) }
    }

    private fun rollDice(txt: TextView) {
        val randomInt = (1..6).random()
        txt.text = randomInt.toString()
    }

    private fun resetDice(txt: TextView) {
        txt.text = 0.toString()
    }
}
