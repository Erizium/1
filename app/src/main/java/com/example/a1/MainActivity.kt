package com.example.a1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.room.Room
import kotlinx.coroutines.*



class MainActivity : AppCompatActivity() {

    private lateinit var db: AppDatabase

    private val TAG = "!!!"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Before db build")

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "AppQuestions"
        )
            .fallbackToDestructiveMigration()
            .build()

        Log.d(TAG, "Before addQuestions")

        addSavannaQuestions()
        addForestQuestions()

        Log.d(TAG, "Before startButton")

        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            val questions = Intent(this, QuestionActivity::class.java)
            startActivity(questions)
        }

        Log.d(TAG, "After startButton")
    }


    fun saveQuestions(questions: Questions){
        GlobalScope.launch(Dispatchers.IO){
            db.questionDao().insert(questions)
        }
    }
    fun addSavannaQuestions(){
        var questionOne = Questions(
            1,
            "What is this?",
            "First question. Don't get this wrong",
            R.drawable.zebrapart,
            R.drawable.savanna,
            "Horse",
            "Zebra",
            "Koala",
            "Mohawk",
            "Zebra",
            "Savanna")
        saveQuestions(questionOne)

        var questionTwo = Questions(
            2,
            "What's the zebras natural habitat?",
            "",
            R.drawable.zebrafull,
            R.drawable.savanna,
            "Desert",
            "Grove",
            "Savanna",
            "Pasture",
            "Savanna",
            "Savanna")
        saveQuestions(questionTwo)

        var questionThree = Questions(
            3,
            "How fast can they run?",
            "*Racing with tigers*",
            R.drawable.zebrarun,
            R.drawable.savanna,
            "64 km/h",
            "60 km/h",
            "55 km/h",
            "47 km/h",
            "64 km/h",
            "Savanna")
        saveQuestions(questionThree)

        var questionFour = Questions(
            4,
            "What's their most common food?",
            "*Nom nom*",
            R.drawable.zebraeat,
            R.drawable.savanna,
            "Leaves",
            "Hay",
            "Grass",
            "Insects",
            "Grass",
            "Savanna")
        saveQuestions(questionFour)

        var questionFive = Questions(
            5,
            "What is the average weight of\nof a full grown male zebra?",
            "They can't be that heavy right?",
            questionOne.image,
            R.drawable.savanna,
            "230 kg",
            "450 kg",
            "603 kg",
            "320 kg",
            "320 kg",
            "Savanna")
        saveQuestions(questionFive)
        Log.d(TAG, "SavannaQuestionsAdded")
    }

    fun addForestQuestions(){

        var questionOne = Questions(
            1,
            "Which country contains the majority\n of the Amazon Rainforest?",
            "Good Luck",
            R.drawable.brazil1,
            R.drawable.forestbg,
            "Peru",
            "Brazil",
            "Colombia",
            "France",
            "Brazil",
            "Forest")
        saveQuestions(questionOne)

        var questionTwo = Questions(
            2,
            "How much of the forest is\n contained within Brazil?",
            "Hint: Sesenta por ciento",
            R.drawable.brazil2,
            R.drawable.forestbg,
            "40 %",
            "70 %",
            "60 %",
            "65 %",
            "60 %",
            "Forest")
        saveQuestions(questionTwo)

        var questionThree = Questions(
            3,
            " How many percent of the oxygen\n does the Brazil section produce?",
            "Hint: In the world",
            R.drawable.o2,
            R.drawable.forestbg,
            "20 %",
            "12 %",
            "6 %",
            "10 %",
            "12 %",
            "Forest")
        saveQuestions(questionThree)

        var questionFour = Questions(
            4,
            " What species is producing the\n most oxygen there?  ",
            "Hint: They can grow tall or not at all",
            R.drawable.o2double,
            R.drawable.forestbg,
            "Plants",
            "Fungi",
            "Animal",
            "Dirt",
            "Plants",
            "Forest")
        saveQuestions(questionFour)

        var questionFive = Questions(
            5,
            " How is the oxygen produced\n through plants?",
            "Hint: Draws up, takes in and then releases",
            R.drawable.tree,
            R.drawable.forestbg,
            "Sodium",
            "Uranium",
            "Absorbtion",
            "Photosynthesis",
            "Photosynthesis",
            "Forest")
        saveQuestions(questionFive)

        Log.d(TAG, "ForestQuestionsAdded")
    }
}