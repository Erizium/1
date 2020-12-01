package com.example.a1

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuestionDao {

    @Insert
    fun insert(question: Questions)

    @Query("SELECT * FROM questions")
    fun getAll() : List<Questions>

    @Query("SELECT * FROM Questions WHERE category LIKE :categoryName")
    fun findByCategory(categoryName: String) : List<Questions>

}