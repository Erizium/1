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
        var restart = Intent(this, QuestionActivity::class.java)
        startActivity(restart)
    }

    fun quit(quit: View){
        var quit = Intent(this, MainActivity::class.java)
        startActivity(quit)
    }
}