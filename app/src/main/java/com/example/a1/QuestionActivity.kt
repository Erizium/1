package com.example.a1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.core.view.isInvisible
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        questionOne()
    }

   fun questionOne(){

        var questionOption = Constants.questionOne

        questionImage.setImageResource(questionOption.image)
        button1.text = questionOption.optionOne
        button2.text = questionOption.OptionTwo
        button3.text = questionOption.optionThree
        button4.text = questionOption.optionFour

        button2.setOnClickListener {
            questionTwo()
            Log.d("!!!", "2")
            button1.setOnClickListener { null }
        }

    }

    fun questionTwo(){

        val questionOption = Constants.questionTwo

        questionImage.setImageResource(questionOption.image)
        button1.text = questionOption.optionOne
        button2.text = questionOption.OptionTwo
        button3.text = questionOption.optionThree
        button4.text = questionOption.optionFour

        button3.setOnClickListener {
            questionThree()
            Log.d("!!!", "3")

        }

    }

    fun questionThree(){

        val questionOption = Constants.questionThree

        questionImage.setImageResource(questionOption.image)
        button1.text = questionOption.optionOne
        button2.text = questionOption.OptionTwo
        button3.text = questionOption.optionThree
        button4.text = questionOption.optionFour

        button1.isInvisible

        button1.setOnClickListener {

            Log.d("!!!", "4")
        }
    }


}