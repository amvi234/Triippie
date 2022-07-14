package com.example.triippie.model
import  com.example.triippie.model.Places
import com.example.triippie.R


class KotaData{
    fun loadSpots():List<Spot>{
        return listOf(Spot(R.string.spot13,R.drawable.raja,R.string.rating1,R.string.ratingcount1),
            Spot(R.string.spot14,R.drawable.raja1,R.string.rating2,R.string.ratingcount2),
            Spot(R.string.spot15,R.drawable.raja4,R.string.rating3,R.string.ratingcount3),
            Spot(R.string.spot16,R.drawable.raja5,R.string.rating4,R.string.ratingcount4))
    }
}
