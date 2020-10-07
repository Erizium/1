package com.example.a1

class QuestionList() {

    var questionList = mutableListOf<Questions>()

    init {
        getQuestions()
    }

    fun getQuestions() {

        var questionOne = Questions(
            "What is this?",
            "",
            R.drawable.zebra,
            0,
            R.drawable.savanna,
            "Horse",
            "Zebra",
            "Koala",
            "Mohawk",
            "Zebra")
        questionList.add(questionOne)

        var questionTwo = Questions(
            "What's the zebras natural habitat?",
            "",
            questionOne.image,
            0,
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
            questionOne.image,
            0,
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
            questionOne.image,
            0,
            questionOne.background,
            "Leaves",
            "Twigs",
            "Grass",
            "Insects",
            "Grass")
        questionList.add(questionFour)

        var questionFive = Questions(
            "What is the average weight of \nof a full grown male zebra?",
            "Answers are in kg",
            questionOne.image,
            0,
            questionOne.background,
            "230",
            "450",
            "603",
            "320",
            "320")
        questionList.add(questionFive)
/*
        val questionFour = Questions(
            "What is this?",
            R.drawable.boulder,
            0,
            R.drawable.forest,
            "Grass",
            "Tree",
            "Boulder",
            "Cave",
            "Boulder")
        questionList.add(questionFour)

        var questionFive = Questions(
            "How many square feet does the \n biggest" +
                    "rock in the world cover?",
            0,
            0,
            questionFour.background,
            "500",
            "900",
            "3700",
            "5800",
            "5800")
        questionList.add(questionFive)

        val questionSix = Questions(
            "Most popular mmo role?",
            R.drawable.hero3,
            0,
            0,
            "Tank",
            "Healer",
            "DPS",
            "Spear",
            "DPS")
        questionList.add(questionSix)
    */
    }
}