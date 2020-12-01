package com.example.a1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.room.Room
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    private lateinit var db: AppDatabase
    val TAG = "!!!"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "AppQuestions"
        )
            .fallbackToDestructiveMigration()
            .build()


        Log.d(TAG, "Starting")

     //   addSavannaQuestions()
      //  addForestQuestions()

        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            val questions = Intent(this, QuestionActivity::class.java)
            startActivity(questions)
        }
    }
    fun addQuestions(question: Questions){
        GlobalScope.launch(Dispatchers.IO){
            db.questionDao().insert(question)
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
            "savanna")
        addQuestions(questionOne)

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
            "savanna")
        addQuestions(questionTwo)

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
            "savanna")
        addQuestions(questionThree)

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
            "savanna")
        addQuestions(questionFour)

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
            "savanna")
        addQuestions(questionFive)

        return
    }

    fun addForestQuestions(){
            var questionOne = Questions(
                6,
                "Which country contains the majority\n of the Amazon Rainforest?",
                "Good Luck",
                R.drawable.brazil1,
                R.drawable.forestbg,
                "Peru",
                "Brazil",
                "Colombia",
                "France",
                "Brazil",
                "forest")
            addQuestions(questionOne)

            var questionTwo = Questions(
                7,
                "How much of the forest is\n contained within Brazil?",
                "Hint: Sesenta por ciento",
                R.drawable.brazil2,
                questionOne.background,
                "40 %",
                "70 %",
                "60 %",
                "65 %",
                "60 %",
                "forest")
            addQuestions(questionTwo)

            var questionThree = Questions(
                8,
                " How many percent of the oxygen\n does the Brazil section produce?",
                "Hint: In the world",
                R.drawable.o2,
                questionOne.background,
                "20 %",
                "12 %",
                "6 %",
                "10 %",
                "12 %",
                "forest")
            addQuestions(questionThree)

            var questionFour = Questions(
                9,
                " What species is producing the\n most oxygen there?  ",
                "Hint: They can grow tall or not at all",
                R.drawable.o2double,
                questionOne.background,
                "Plants",
                "Fungi",
                "Animal",
                "Dirt",
                "Plants",
                "forest")
            addQuestions(questionFour)

            var questionFive = Questions(
                10,
                " How is the oxygen produced\n through plants?",
                "Hint: Draws up, takes in and then releases",
                R.drawable.tree,
                questionOne.background,
                "Sodium",
                "Uranium",
                "Absorbtion",
                "Photosynthesis",
                "Photosynthesis",
                "forest")
            addQuestions(questionFive)
        return
    }
}