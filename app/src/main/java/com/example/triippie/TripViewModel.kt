package com.example.triippie

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TripViewModel(application: Application): AndroidViewModel(application) {

    private val repository: TripRepository
    val allTrips : LiveData<List<Trip>>
    init{
        val dao= TripDatabase.getDatabase(application).getTripDao()
        repository = TripRepository(dao)
        allTrips = repository.allTrips
    }
    fun deleteTrip(trip:Trip) = viewModelScope.launch(Dispatchers.IO) {
        repository.delete(trip)
    }
    fun insertTrip(trip: Trip) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(trip)
    }
}