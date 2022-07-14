package com.example.triippie.model

import com.example.triippie.R

class MumbaiData {
    fun loadSpots():List<Spot>{
        return listOf(
            Spot(R.string.spot6, R.drawable.mumbai1,R.string.rating1,R.string.ratingcount1),
            Spot(R.string.spot7, R.drawable.mumbai3,R.string.rating2,R.string.ratingcount3),
            Spot(R.string.spot8, R.drawable.mumbai2,R.string.rating3,R.string.ratingcount3),
            Spot(R.string.spot9, R.drawable.mumbai4,R.string.rating4,R.string.ratingcount4))
    }
}