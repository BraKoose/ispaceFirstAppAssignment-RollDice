package com.koose.ispacefirstappassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var textID: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textID = findViewById(R.id.result_text)


        //Get the Button View  to roll the dice and click

        val rollbutton:Button = findViewById(R.id.roll_button)

        rollbutton.setOnClickListener {
            rolldice()
        }

        val countButton:Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener {
            countUp() }

    }

    private fun rolldice(){
        Toast.makeText(this, "Dice Rolled",
        Toast.LENGTH_SHORT).show()

        val randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }
     // Get the Button View to countUp the Value of the dice rolled
    private fun  countUp(){


        textID = findViewById(R.id.result_text)

         if (textID.text == "HelloWorld!"){
             textID.text = "1"
         }else{
             //Otherwise increase the number up to 6
             var resultDice = textID.text.toString().toInt()

             if(resultDice<6){
                 resultDice++
                 textID.text = resultDice.toString()

                 // for Better understanding Lets Toast what happen lol
                 Toast.makeText(this, "$resultDice Here i come lol",
                     Toast.LENGTH_SHORT).show()
             }
         }
    }



}

