package com.example.a1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Questions")
data class Questions(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "question") var question : String,
    @ColumnInfo(name = "info") var info : String,
    var image : Int,
    var background : Int,
    @ColumnInfo(name = "optionOne") var optionOne : String,
    @ColumnInfo(name = "optionTwo") var optionTwo : String,
    @ColumnInfo(name = "optionThree") var optionThree : String,
    @ColumnInfo(name = "optionFour") var optionFour : String,
    @ColumnInfo(name = "correctAnswer") var correctAnswer : String) {
}

//Göra en extra questions data klass, en för Savanna och en för Forest?