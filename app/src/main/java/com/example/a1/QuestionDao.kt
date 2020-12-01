package com.example.a1

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuestionDao {

    @Insert
    fun insert(questions: Questions)
/*
    @Query("DELETE FROM Questions")
    fun delete()
*/
    @Query("SELECT * FROM Questions")
    fun getAll() : List<Questions>


    @Query("SELECT * FROM Questions WHERE category LIKE :categoryName")
    fun findByCategory(categoryName: String) : List<Questions>


}