package com.example.a1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button


import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity(){

    val questionList = QuestionList()
    var currentQuestion: Questions? = null
    var currentPosition: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)


        setQuestion()
    }

    fun setQuestion(){

        currentQuestion = questionList.questionList[currentPosition]

        questionText.text = currentQuestion!!.question
        questionImage.setImageResource(currentQuestion!!.image)
        option_one.text = currentQuestion?.optionOne
        option_two.text = currentQuestion?.OptionTwo
        option_three.text = currentQuestion?.optionThree
        option_four.text = currentQuestion?.optionFour

        currentPosition++
    }

    fun buttonPressed(view: View) {
        var button = view as Button

            if (button.text == currentQuestion?.correctAnswer) {
                setQuestion()
            }else{
                var failScreen = Intent(this, WrongAnswerActivity::class.java)
                startActivity(failScreen)
            }




    }



}









