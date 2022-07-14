package com.example.triippie.model

import com.example.triippie.R

class SevenSisterData {
    fun loadSpots():List<Spot>{
        return listOf(
            Spot(R.string.spot10, R.drawable.seven1,R.string.rating1,R.string.ratingcount1),
            Spot(R.string.spot11, R.drawable.seven2,R.string.rating2,R.string.ratingcount2),
            Spot(R.string.spot12, R.drawable.seven3,R.string.rating2,R.string.ratingcount2),
        )

    }
}