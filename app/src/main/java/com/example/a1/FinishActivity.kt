package com.example.a1

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

            if(score >= 4){


            }else{

            }
        }

    }
}