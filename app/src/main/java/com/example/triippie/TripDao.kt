package com.example.triippie

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TripDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
     suspend fun insert(trip: Trip)

    @Delete
    suspend fun delete(trip: Trip)

    @Query("Select * from trips_table order by id ASC")
    fun getAllTrips() : LiveData<List<Trip>>

}