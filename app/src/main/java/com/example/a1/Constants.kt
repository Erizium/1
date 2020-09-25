package com.example.a1

object Constants {

    var questionList = mutableListOf<Questions>()

    init {
        createQuestions()
    }

    fun createQuestions() {
        val questionOne = Questions(
            "What is this?",
            R.drawable.zebra,
            "Horse",
            "Zebra",
            "Koala",
            "Mohawk",
            2)
        questionList.add(questionOne)

        val questionTwo = Questions(
            "What is this?",
            R.drawable.boulder,
            "Grass",
            "Tree",
            "Boulder",
            "Cave",
            3)
        questionList.add(questionTwo)

        val questionThree = Questions(
            "Most popular mmo role?",
            0,
            "Tank",
            "Healer",
            "DPS",
            "Spear",
            3)
        questionList.add(questionThree)
    }
}