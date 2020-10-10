package com.example.a1

class QuestionListForest {

    var questionList2 = mutableListOf<Questions>()

    init {
        getForestQuestions()
    }

    fun getForestQuestions(){
        var questionOne = Questions(
            "Which country contains the majority \nof the Amazon Rainforest?",
            "",
            R.drawable.brazil,
            R.drawable.forest,
            "Peru",
            "Brazil",
            "Colombia",
            "France",
            "Brazil")
        questionList2.add(questionOne)

        var questionTwo = Questions(
            "How much of the forest is \ncontained within Brazil?",
            "",
            0,
            questionOne.background,
            "40 %",
            "70 %",
            "60 %",
            "65 %",
            "60 %")
        questionList2.add(questionTwo)

        var questionThree = Questions(
            "How many percent of oxygen does the \nBrazil section produce?",
            "",
            0,
            questionOne.background,
            "20 %",
            "12 %",
            "6 %",
            "10 %",
            "12 %")
        questionList2.add(questionThree)
    }
}