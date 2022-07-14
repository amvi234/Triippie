package com.example.triippie.model

import com.example.triippie.R

class Kashmir {
    fun loadSpots():List<Spot>{
        return listOf(
            Spot(R.string.spot1, R.drawable.kashmir2,R.string.rating1,R.string.ratingcount1),
            Spot(R.string.spot2, R.drawable.kashmir3,R.string.rating2,R.string.ratingcount2),
            Spot(R.string.spot3, R.drawable.tulip1,R.string.rating3,R.string.ratingcount3),
            Spot(R.string.spot4, R.drawable.kashmir5,R.string.rating4,R.string.ratingcount4),
            Spot(R.string.spot5, R.drawable.kashmir4,R.string.rating5,R.string.ratingcount5)
            )
    }
}