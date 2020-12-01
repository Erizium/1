package com.example.a1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.room.Room

class MainActivity : AppCompatActivity() {

    private lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startButton = findViewById<Button>(R.id.startButton)

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "AppQuestions"
        )
            .fallbackToDestructiveMigration()
            .build()

        startButton.setOnClickListener {
            val questions = Intent(this, QuestionActivity::class.java)
            startActivity(questions)
        }
    }
}