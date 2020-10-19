package com.example.a1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

       var score = intent.getIntExtra("score", 0)
        scoreText.text = score.toString()

        scoreButton.setOnClickListener {
            scoreText.setVisibility(View.VISIBLE)
            goodText.setVisibility(View.VISIBLE)
            scoreButton.text = "To Start"

            if(score >= 4){
                goodText.text = "Good Job!"
                showView.setVisibility(View.INVISIBLE)
                quitButton.setVisibility(View.VISIBLE)
                if(score == 5){
                    goodText.text = "Perfect Score!"
                }
            }else {
                goodText.text = "You suck, try again."
                showView.setVisibility(View.INVISIBLE)
                scoreButton.text = "What?!"
            }
            scoreButton.setOnClickListener{
                val surprise = Intent(this, QuestionActivity::class.java)
                startActivity(surprise)
            }
        }
    }
}