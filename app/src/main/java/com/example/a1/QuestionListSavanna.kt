package com.example.a1

class QuestionListSavanna() {

    var questionList = mutableListOf<Questions>()

    init {
        getZebraQuestions()
    }

    fun getZebraQuestions() {

        var questionOne = Questions(
            "What is this?",
            "",
            R.drawable.zebra,
            R.drawable.savanna,
            "Horse",
            "Zebra",
            "Koala",
            "Mohawk",
            "Zebra")
        questionList.add(questionOne)

        var questionTwo = Questions(
            "What's the zebras natural habitat?",
            "If you get this wrong...",
            R.drawable.fullzebra,
            questionOne.background,
            "Desert",
            "Grove",
            "Savanna",
            "Pasture",
            "Savanna")
        questionList.add(questionTwo)

        var questionThree = Questions(
            "How fast can they run?",
            "Answers are in km/h",
            R.drawable.zebrarun,
            questionOne.background,
            "64",
            "60",
            "55",
            "47",
            "64")
        questionList.add(questionThree)

        var questionFour = Questions(
            "What's their most common food?",
            "",
            R.drawable.zebraeat,
            questionOne.background,
            "Leaves",
            "Hay",
            "Grass",
            "Insects",
            "Grass")
        questionList.add(questionFour)

        var questionFive = Questions(
            "What is the average weight of \nof a full grown male zebra?",
            "Answers are in kg",
            questionOne.image,
            questionOne.background,
            "230",
            "450",
            "603",
            "320",
            "320")
        questionList.add(questionFive)
    }
}