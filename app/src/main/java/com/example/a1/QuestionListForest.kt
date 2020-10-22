package com.example.a1

class QuestionListForest {

    var questionList2 = mutableListOf<Questions>()

    init {
        getForestQuestions()
    }

    fun getForestQuestions(){
        var questionOne = Questions(
            "Which country contains the majority\n of the Amazon Rainforest?",
            "Good Luck",
            R.drawable.brazil1,
            R.drawable.forestbg,
            "Peru",
            "Brazil",
            "Colombia",
            "France",
            "Brazil")
        questionList2.add(questionOne)

        var questionTwo = Questions(
            "How much of the forest is\n contained within Brazil?",
            "Hint: Sesenta por ciento",
            R.drawable.brazil2,
            questionOne.background,
            "40 %",
            "70 %",
            "60 %",
            "65 %",
            "60 %")
        questionList2.add(questionTwo)

        var questionThree = Questions(
            " How many percent of the oxygen\n does the Brazil section produce?",
            "Hint: In the world",
            R.drawable.o2,
            questionOne.background,
            "20 %",
            "12 %",
            "6 %",
            "10 %",
            "12 %")
        questionList2.add(questionThree)

        var questionFour = Questions(
            " What species is producing the\n most oxygen there?  ",
            "Hint: They can grow tall or not at all",
            R.drawable.o2double,
            questionOne.background,
            "Plants",
            "Fungi",
            "Animal",
            "Dirt",
            "Plants")
        questionList2.add(questionFour)

        var questionFive = Questions(
            " How is the oxygen produced\n through plants?",
            "Hint: Draws up, takes in and then releases",
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