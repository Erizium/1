package com.example.a1

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Questions::class), version = 7)
abstract class AppDatabase : RoomDatabase(){

    abstract fun questionDao() : QuestionDao

}