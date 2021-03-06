package com.example.a1

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuestionDao {

    @Insert
    fun insert(questions: Questions)

    @Query("SELECT * FROM Questions")
    fun getAll() : List<Questions>

    @Query("SELECT * FROM Questions WHERE category = :savanna")
    fun category(savanna: String) : List<Questions>

    @Query("SELECT * FROM Questions WHERE category = :forest")
    fun category2(forest: String) : List<Questions>

}