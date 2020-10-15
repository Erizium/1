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
            "",
            R.drawable.zebrarun,
            questionOne.background,
            "64 km/h",
            "60 km/h",
            "55 km/h",
            "47 km/h",
            "64 km/h")
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
            "",
            questionOne.image,
            questionOne.background,
            "230 kg",
            "450 kg",
            "603 kg",
            "320 kg",
            "320 kg")
        questionList.add(questionFive)
    }
}