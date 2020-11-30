package com.example.a1

class QuestionListSavanna() {

    var questionList = mutableListOf<SavannaQuestion>()

    init {
        getZebraQuestions()
    }

    fun getZebraQuestions() {

        var questionOne = SavannaQuestion(
            0,
            "What is this?",
            "First question. Don't get this wrong",
            R.drawable.zebrapart,
            R.drawable.savanna,
            "Horse",
            "Zebra",
            "Koala",
            "Mohawk",
            "Zebra")
        questionList.add(questionOne)

        var questionTwo = SavannaQuestion(
            0,
            "What's the zebras natural habitat?",
            "",
            R.drawable.zebrafull,
            R.drawable.savanna,
            "Desert",
            "Grove",
            "Savanna",
            "Pasture",
            "Savanna")
        questionList.add(questionTwo)

        var questionThree = SavannaQuestion(
            0,
            "How fast can they run?",
            "*Racing with tigers*",
            R.drawable.zebrarun,
            R.drawable.savanna,
            "64 km/h",
            "60 km/h",
            "55 km/h",
            "47 km/h",
            "64 km/h")
        questionList.add(questionThree)

        var questionFour = SavannaQuestion(
            0,
            "What's their most common food?",
            "*Nom nom*",
            R.drawable.zebraeat,
            R.drawable.savanna,
            "Leaves",
            "Hay",
            "Grass",
            "Insects",
            "Grass")
        questionList.add(questionFour)

        var questionFive = SavannaQuestion(
            0,
            "What is the average weight of\nof a full grown male zebra?",
            "They can't be that heavy right?",
            questionOne.image,
            R.drawable.savanna,
            "230 kg",
            "450 kg",
            "603 kg",
            "320 kg",
            "320 kg")
        questionList.add(questionFive)
    }
}