package com.example.a1

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Questions::class), version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun questionDao() : QuestionDao
}