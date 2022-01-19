package com.koose.ispacefirstappassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)


        //Get the Button View  to roll the dice and click

        val rollbutton:Button = findViewById(R.id.roll_button)

        rollbutton.setOnClickListener {
            rolldice()
        }

//        val countButton:Button = findViewById(R.id.countup_button)
//        countButton.setOnClickListener {
//            countUp() }

    }

    private fun rolldice(){
        Toast.makeText(this, "Dice Rolled",
        Toast.LENGTH_SHORT).show()

        val randomInt = (1..6).random()

        //putting the images into a variable for easy play in drwaableResources

        val drawbleResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawbleResource)

    }
     // Get the Button View to countUp the Value of the dice rolled
//    private fun  countUp(){
//
//
//        diceImage = findViewById(R.id.dice_image)
//
//
//             //Otherwise increase the number up to 6
//             var resultDice = diceImage.drawable.toString().toInt()
//
//             if(resultDice<6){
//                 resultDice++
//
//                 // for Better understanding Lets Toast what happen lol
//                 Toast.makeText(this, "$resultDice Here i come lol",
//                     Toast.LENGTH_SHORT).show()
//             }
//         }
    }




