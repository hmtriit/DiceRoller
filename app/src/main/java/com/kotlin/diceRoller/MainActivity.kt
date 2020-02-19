package com.kotlin.diceRoller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var diceImage: ImageView
    lateinit var rollButton: Button

    override fun onClick(v: View?) {
        rollDice()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton = findViewById(R.id.roll_button)
        rollButton.setOnClickListener(this)

    }

    fun rollDice() {
        diceImage = findViewById(R.id.dice_image);
        val randomInt = Random.nextInt(6) + 1

        var drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        Toast.makeText(this, "Roll Result: " + randomInt, Toast.LENGTH_LONG).show();
        diceImage.setImageResource(drawableResource)
    }
}
