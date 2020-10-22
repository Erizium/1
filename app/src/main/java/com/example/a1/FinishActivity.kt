package com.example.a1

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var mp: MediaPlayer

        mp = MediaPlayer.create(this, R.raw.applause)
        mp.setVolume(0.5f, 0.5f)

        mp.start()

       var score = intent.getIntExtra("score", 0)
        scoreText.text = score.toString()

        scoreButton.setOnClickListener {
            scoreText.setVisibility(View.VISIBLE)
            goodText.setVisibility(View.VISIBLE)
            scoreButton.text = "Retry"

            if(score >= 3){
                goodText.text = "Good Job!"
                showView.setVisibility(View.INVISIBLE)
                titleButton.setVisibility(View.VISIBLE)

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
                Toast.makeText(this, "Retried", Toast.LENGTH_SHORT).show()
            }
        }
        titleButton.setOnClickListener {
            val titleScreen = Intent(this, MainActivity::class.java)
            startActivity(titleScreen)
            Toast.makeText(this, "Returned", Toast.LENGTH_SHORT).show()
        }
    }
}