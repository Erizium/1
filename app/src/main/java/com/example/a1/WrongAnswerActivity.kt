package com.example.a1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WrongAnswerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrong_answer)

    }

    fun restart(restart: View){

        var intent = Intent(this, QuestionActivity::class.java)
        startActivity(intent)
    }

    fun quit(quit: View){

    }
}