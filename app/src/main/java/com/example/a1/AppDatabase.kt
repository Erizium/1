package com.example.a1

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Questions::class), version = 7)
abstract class AppDatabase : RoomDatabase(){

    abstract fun questionDao() : QuestionDao

    companion object {
        @Volatile
        private var INSTANCE : AppDatabase? = null

        fun getInstance(context : Context) : AppDatabase? {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java, "AppQuestions"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }

                return instance
            }
        }
    }

}