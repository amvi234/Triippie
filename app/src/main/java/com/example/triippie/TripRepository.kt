package com.example.triippie

import androidx.lifecycle.LiveData

class TripRepository(private  val tripDao: TripDao) {
    val allTrips:LiveData<List<Trip>> = tripDao.getAllTrips()

    suspend fun insert(trip: Trip){
        tripDao.insert(trip)
    }

    suspend fun delete(trip: Trip){
        tripDao.delete(trip)
    }

}