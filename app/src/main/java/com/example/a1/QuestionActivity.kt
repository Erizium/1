package com.example.a1

import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat


import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {
    //music!
    private lateinit var mp: MediaPlayer
    private lateinit var mp2: MediaPlayer
    val questionList = QuestionListSavanna()
    val questionList2 = QuestionListForest()
    var currentQuestion: Questions? = null
    var currentPosition: Int = 1
    var score = 0
    var type = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        quizMusic()

        savannaQuiz.setOnClickListener {
            mp.start()
            setZebraQuestions()
            setVisiInvis()
            colorChangeSavanna()
        }
        forestQuiz.setOnClickListener {
            mp2.start()
            setForestQuestions()
            type += 1
            setVisiInvis()
            colorChangeForest()
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

        scoreCounter.text = "Score: " + score
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

        scoreCounter.text = "Score: " + score
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
            if (button.text == currentQuestion?.correctAnswer){
                score++
            }
            mp.stop()
            mp2.stop()
            val end = Intent(this, FinishActivity::class.java)
            end.putExtra("score", score)
            finish()
            startActivity(end)
        }
    }
    fun setVisiInvis(){
        savannaQuiz.setVisibility(View.INVISIBLE)
        forestQuiz.setVisibility(View.INVISIBLE)

        option_one.setVisibility(View.VISIBLE)
        option_two.setVisibility(View.VISIBLE)
        option_four.setVisibility(View.VISIBLE)
        option_three.setVisibility(View.VISIBLE)
        questionImage.setVisibility(View.VISIBLE)
        questionCount.setVisibility(View.VISIBLE)
        scoreCounter.setVisibility(View.VISIBLE)

        return
    }
    fun colorChangeForest(){

        questionText.setTextColor(Color.parseColor("#ffffff"))
        questionInfo.setTextColor(Color.parseColor("#ffffff"))
        questionCount.setTextColor(Color.parseColor("#ffffff"))
        scoreCounter.setTextColor(Color.parseColor("#ffffff"))

        option_one.setTextColor(Color.parseColor("#ffffff"))
        option_one.setBackgroundResource(R.drawable.rounded_corners_white)
        option_two.setTextColor(Color.parseColor("#ffffff"))
        option_two.setBackgroundResource(R.drawable.rounded_corners_white)
        option_three.setTextColor(Color.parseColor("#ffffff"))
        option_three.setBackgroundResource(R.drawable.rounded_corners_white)
        option_four.setTextColor(Color.parseColor("#ffffff"))
        option_four.setBackgroundResource(R.drawable.rounded_corners_white)

        return
    }
    fun colorChangeSavanna(){

        questionText.setTextColor(Color.parseColor("#000000"))
        questionInfo.setTextColor(Color.parseColor("#000000"))
        questionCount.setTextColor(Color.parseColor("#000000"))
        scoreCounter.setTextColor(Color.parseColor("#000000"))

        option_one.setTextColor(Color.parseColor("#000000"))
        option_one.setBackgroundResource(R.drawable.rounded_corners_black)
        option_two.setTextColor(Color.parseColor("#000000"))
        option_two.setBackgroundResource(R.drawable.rounded_corners_black)
        option_three.setTextColor(Color.parseColor("#000000"))
        option_three.setBackgroundResource(R.drawable.rounded_corners_black)
        option_four.setTextColor(Color.parseColor("#000000"))
        option_four.setBackgroundResource(R.drawable.rounded_corners_black)

        return
    }
    fun quizMusic(){
        mp = MediaPlayer.create(this, R.raw.savanna)
        mp.isLooping = true
        mp.setVolume(0.5f, 0.5f)
        mp2 = MediaPlayer.create(this, R.raw.forest)
        mp2.isLooping = true
        mp2.setVolume(0.5f, 0.5f)

        return
    }
}










