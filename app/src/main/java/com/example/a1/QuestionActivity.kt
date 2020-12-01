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
import androidx.room.Room


import kotlinx.android.synthetic.main.activity_question.*
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class QuestionActivity : AppCompatActivity(), CoroutineScope {
    private lateinit var job : Job
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    private lateinit var db: AppDatabase
    private lateinit var mp: MediaPlayer
    private lateinit var mp2: MediaPlayer

    var questionList : QuestionList? = null

    var currentQuestion: Questions? = null
    var currentPosition: Int = 1
    var score = 0
    var type = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        job = Job()
        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "AppQuestions")
            .fallbackToDestructiveMigration()
            .build()


        quizMusic()

        savannaQuiz.setOnClickListener {
            if(mp.isPlaying || mp2.isPlaying){
                mp.stop()
                mp2.stop()
            }
            mp.start()
            setVisiInvis()
            colorChangeSavanna()

            loadSavannaQuestions()
        }
        forestQuiz.setOnClickListener {
            if(mp.isPlaying || mp2.isPlaying){
                mp.stop()
                mp2.stop()
            }
            mp2.start()
            type += 1
            setVisiInvis()
            colorChangeForest()

            loadForestQuestions()
        }
    }

    fun loadSavannaQuestions(){
        val questions = async(Dispatchers.IO) {
            db.questionDao().category("savanna")
        }
        launch {

            val list = questions.await().toMutableList()
            questionList = QuestionList(list)

            setQuestions()
        }
    }

    fun loadForestQuestions(){
        val questions = async(Dispatchers.IO) {
            db.questionDao().category2("forest")
        }
        launch {

            val list = questions.await().toMutableList()
            questionList = QuestionList(list)
            setQuestions()
        }
    }

    fun setQuestions() {
        currentQuestion = questionList!!.questions[currentPosition -1]

        questionText.text = currentQuestion!!.question
        questionInfo.text = currentQuestion!!.info
        questionImage.setImageResource(currentQuestion!!.image)
        questionBackground.setBackgroundResource(currentQuestion!!.background)
        option_one.text = currentQuestion?.optionOne
        option_two.text = currentQuestion?.optionTwo
        option_three.text = currentQuestion?.optionThree
        option_four.text = currentQuestion?.optionFour
        questionCount.text = "Question: " + currentPosition.toString()

        scoreCounter.text = "Score: " + score
        currentPosition++
    }

    fun buttonPressed(view: View) {
        var button = view as Button

        if (currentPosition <= questionList!!.questions.size) {
            if (type == 0) {
                if (button.text == currentQuestion?.correctAnswer) {
                    questionCount.text = currentPosition.toString()
                    score++
                    setQuestions()
                } else {
                    questionCount.text = currentPosition.toString()
                    setQuestions()
                }
            } else {
                if (button.text == currentQuestion?.correctAnswer) {
                    questionCount.text = currentPosition.toString()
                    score++
                    setQuestions()
                } else {
                    questionCount.text = currentPosition.toString()
                    setQuestions()
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










