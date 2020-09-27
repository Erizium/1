package com.example.a1

object Constants {

 //   var questionList = mutableListOf<Questions>()
    fun getQuestions() : ArrayList<Questions> {
     val questionsList = ArrayList<Questions>()

        var questionOne = Questions(
            1,
            "What is this?",
            R.drawable.zebra,
            "Horse",
            "Zebra",
            "Koala",
            "Mohawk",
            2)
        questionsList.add(questionOne)

        val questionTwo = Questions(
            2,
            "What is this?",
            R.drawable.boulder,
            "Grass",
            "Tree",
            "Boulder",
            "Cave",
            3)
        questionsList.add(questionTwo)

        val questionThree = Questions(
            3,
            "Most popular mmo role?",
            0,
            "Tank",
            "Healer",
            "DPS",
            "Spear",
            3)
        questionsList.add(questionThree)

     return questionsList
    }
}