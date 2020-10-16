package com.example.a1

class QuestionListForest {

    var questionList2 = mutableListOf<Questions>()

    init {
        getForestQuestions()
    }

    fun getForestQuestions(){
        var questionOne = Questions(
            "Which country contains the majority \nof the Amazon Rainforest?",
            "Good Luck",
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
            R.drawable.brazil,
            questionOne.background,
            "40 %",
            "70 %",
            "60 %",
            "65 %",
            "60 %")
        questionList2.add(questionTwo)

        var questionThree = Questions(
            " How many percent of the oxygen\n does the Brazil section produce?",
            "Roughly",
            R.drawable.cloudo2,
            questionOne.background,
            "20 %",
            "12 %",
            "6 %",
            "10 %",
            "12 %")
        questionList2.add(questionThree)

        var questionFour = Questions(
            " What is producing the most\n most of oxygen there?  ",
            "",
            R.drawable.cloudo2,
            questionOne.background,
            "Plants",
            "Fungi",
            "Animal",
            "Dirt",
            "Plants")
        questionList2.add(questionFour)

        var questionFive = Questions(
            " How is the oxygen produced\n through plants?",
            "Through",
            R.drawable.tree,
            questionOne.background,
            "Sodium",
            "Uranium",
            "Absorbtion",
            "Photosynthesis",
            "Photosynthesis")
        questionList2.add(questionFive)
    }
}