package com.example.a1

class QuestionList() {

    var questionList = mutableListOf<Questions>()

    init {
        getQuestions()
    }

    fun getQuestions() {

        var questionOne = Questions(
            "What is this?",
            R.drawable.zebra,
            "Horse",
            "Zebra",
            "Koala",
            "Mohawk",
            "Zebra")
        questionList.add(questionOne)

        val questionTwo = Questions(
            "What is this?",
            R.drawable.boulder,
            "Grass",
            "Tree",
            "Boulder",
            "Cave",
            "Boulder")
        questionList.add(questionTwo)

        val questionThree = Questions(
            "Most popular mmo role?",
            R.drawable.hero3,
            "Tank",
            "Healer",
            "DPS",
            "Spear",
            "DPS")
        questionList.add(questionThree)
    }
}