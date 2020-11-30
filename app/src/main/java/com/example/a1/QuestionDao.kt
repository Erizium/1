package com.example.a1

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface QuestionDao {

    @Insert
    fun insert(questions: SavannaQuestion)

/*
    @Delete
    fun delete(questions: Questions)
*/

    @Query("SELECT * FROM SavannaQuestions")
    fun getAll() : List<SavannaQuestion>

    @Query("SELECT * FROM SavannaQuestions WHERE question LIKE :questionName")
    fun findByQuestion(questionName: String) : List<SavannaQuestion>

}