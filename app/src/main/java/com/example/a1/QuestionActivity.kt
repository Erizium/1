package com.example.a1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    val questionList = QuestionListSavanna()
    val questionList2 = QuestionListForest()
    var currentQuestion: Questions? = null
    var currentPosition: Int = 1
    var score = 0
    var type = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        savannaQuiz.setOnClickListener {
            setZebraQuestions()
            savannaQuiz.setVisibility(View.INVISIBLE)
            forestQuiz.setVisibility(View.INVISIBLE)

            option_one.setVisibility(View.VISIBLE)
            option_two.setVisibility(View.VISIBLE)
            option_three.setVisibility(View.VISIBLE)
            option_four.setVisibility(View.VISIBLE)
            questionImage.setVisibility(View.VISIBLE)
            questionCount.setVisibility(View.VISIBLE)
        }
        forestQuiz.setOnClickListener {
            setForestQuestions()
            type += 1
            savannaQuiz.setVisibility(View.INVISIBLE)
            forestQuiz.setVisibility(View.INVISIBLE)

            option_one.setVisibility(View.VISIBLE)
            option_two.setVisibility(View.VISIBLE)
            option_four.setVisibility(View.VISIBLE)
            option_three.setVisibility(View.VISIBLE)
            questionImage.setVisibility(View.VISIBLE)
            questionCount.setVisibility(View.VISIBLE)
            scoreCounter.setVisibility(View.VISIBLE)
        }
    }

    fun setZebraQuestions() {
        currentQuestion = questionList.questionList[currentPosition -1]
        questionText.text = currentQuestion!!.question
        questionInfo.text = currentQuestion!!.info
        questionImage.setImageResource(currentQuestion!!.image)
        questionBackground.setBackgroundResource(currentQuestion!!.background)
        option_one.text = currentQuestion?.optionOne
        option_two.text = currentQuestion?.OptionTwo
        option_three.text = currentQuestion?.optionThree
        option_four.text = currentQuestion?.optionFour
        questionCount.text = "Question: " + currentPosition.toString()
        scoreCounter.text = "Score: " + scoreCounter.toString()
        currentPosition++
    }

    fun setForestQuestions() {
        currentQuestion = questionList2.questionList2[currentPosition -1]
        questionText.text = currentQuestion!!.question
        questionInfo.text = currentQuestion!!.info
        questionImage.setImageResource(currentQuestion!!.image)
        questionBackground.setBackgroundResource(currentQuestion!!.background)
        option_one.text = currentQuestion?.optionOne
        option_two.text = currentQuestion?.OptionTwo
        option_three.text = currentQuestion?.optionThree
        option_four.text = currentQuestion?.optionFour
        questionCount.text = "Question: " + currentPosition.toString()
        scoreCounter.text = "Score: " + score.toString()
        currentPosition++
    }

    fun buttonPressed(view: View) {
        var button = view as Button

        if (currentPosition <= questionList.questionList.size) {
            if (type == 0) {
                if (button.text == currentQuestion?.correctAnswer) {
                    questionCount.text = currentPosition.toString()
                    score++
                    setZebraQuestions()
                } else {
                    questionCount.text = currentPosition.toString()
                    setZebraQuestions()
                }
            } else {
                if (button.text == currentQuestion?.correctAnswer) {
                    questionCount.text = currentPosition.toString()
                    score++
                    setForestQuestions()
                } else {
                    questionCount.text = currentPosition.toString()
                    setForestQuestions()
                }
            }
        } else {
            val end = Intent(this, FinishActivity::class.java)
            startActivity(end)
        }
    }

    fun colorChange(){
        questionText.setTextColor(Color.parseColor("#000000"))
        return
    }


}










