package com.example.a1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity(){


    private var currentPosition: Int = 1
    private var mQuestionList: ArrayList<Questions>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        mQuestionList = Constants.getQuestions()

        val currentPosition = 1
        val question = mQuestionList!![currentPosition -1]

        questionText.text = question!!.question
        questionImage.setImageResource(question.image)
        option_one.text = question.optionOne
        option_two.text = question.OptionTwo
        option_three.text = question.optionThree
        option_four.text = question.optionFour

        setQuestion()
    }

    fun setQuestion(){

        currentPosition = 1
        val question = mQuestionList!![currentPosition -1]

        questionText.text = question!!.question
        questionImage.setImageResource(question.image)
        option_one.text = question.optionOne
        option_two.text = question.OptionTwo
        option_three.text = question.optionThree
        option_four.text = question.optionFour
    }


    }


}






