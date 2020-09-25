package com.example.a1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    var currentPosition = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        loadQuestions()

    }
    fun loadQuestions(){
        var currentQuestion = Constants.questionList.get(currentPosition)

        questionImage.setImageResource(currentQuestion.image)
        questionText.text = currentQuestion.question
        button1.text = currentQuestion.optionOne
        button2.text = currentQuestion.OptionTwo
        button3.text = currentQuestion.optionThree
        button4.text = currentQuestion.optionFour


        }

    }

}