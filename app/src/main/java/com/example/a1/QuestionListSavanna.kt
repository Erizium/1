package com.example.a1

class QuestionListSavanna() {

    var questionList = mutableListOf<Questions>()

    init {
        getZebraQuestions()
    }

    fun getZebraQuestions() {

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
        questionList.add(questionOne)

        var questionTwo = Questions(
            2,
            "What's the zebras natural habitat?",
            "",
            R.drawable.zebrafull,
            questionOne.background,
            "Desert",
            "Grove",
            "Savanna",
            "Pasture",
            "Savanna",
            "Savanna")
        questionList.add(questionTwo)

        var questionThree = Questions(
            3,
            "How fast can they run?",
            "*Racing with tigers*",
            R.drawable.zebrarun,
            questionOne.background,
            "64 km/h",
            "60 km/h",
            "55 km/h",
            "47 km/h",
            "64 km/h",
            "Savanna")
        questionList.add(questionThree)

        var questionFour = Questions(
            4,
            "What's their most common food?",
            "*Nom nom*",
            R.drawable.zebraeat,
            questionOne.background,
            "Leaves",
            "Hay",
            "Grass",
            "Insects",
            "Grass",
            "Savanna")
        questionList.add(questionFour)

        var questionFive = Questions(
            5,
            "What is the average weight of\nof a full grown male zebra?",
            "They can't be that heavy right?",
            questionOne.image,
            questionOne.background,
            "230 kg",
            "450 kg",
            "603 kg",
            "320 kg",
            "320 kg",
            "Savanna")
        questionList.add(questionFive)
    }
}