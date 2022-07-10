package com.example.triippie

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = arrayOf(Trip::class), version = 1, exportSchema = false)
abstract class TripDatabase:RoomDatabase(){

    abstract fun getTripDao(): TripDao
    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: TripDatabase? = null

        fun getDatabase(context: Context): TripDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TripDatabase::class.java,
                    "trip_database"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}