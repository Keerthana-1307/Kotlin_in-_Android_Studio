package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val diceImage = findViewById<ImageView>(R.id.diceImage)
        val rollButton = findViewById<Button>(R.id.rollButton)
        rollButton.setOnClickListener {
            val diceNumber = Random.nextInt(1,7)
            when(diceNumber){
                1 -> diceImage.setImageResource(R.drawable.dice1)
                2 -> diceImage.setImageResource(R.drawable.dice2)
                3 -> diceImage.setImageResource(R.drawable.dice3)
                4 -> diceImage.setImageResource(R.drawable.dice4)
                5 -> diceImage.setImageResource(R.drawable.dice5)
                6 -> diceImage.setImageResource(R.drawable.dice6)
            }
        }
    }
}
