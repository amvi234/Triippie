package com.example.triippie.model

import com.example.triippie.R

class SpotDataSource{

    fun loadKashmirSpots():List<Spot>{
        return listOf(
            Spot(R.string.spot1, R.drawable.kashmir2,R.string.rating1,R.string.ratingcount1),
            Spot(R.string.spot2, R.drawable.kashmir3,R.string.rating2,R.string.ratingcount2),
            Spot(R.string.spot3, R.drawable.tulip1,R.string.rating3,R.string.ratingcount3),
            Spot(R.string.spot4, R.drawable.kashmir5,R.string.rating4,R.string.ratingcount4),
            Spot(R.string.spot5, R.drawable.kashmir4,R.string.rating5,R.string.ratingcount5)
        )
    }

    fun loadKotaSpots():List<Spot>{
        return listOf(Spot(R.string.spot13,R.drawable.raja,R.string.rating1,R.string.ratingcount1),
            Spot(R.string.spot14,R.drawable.raja1,R.string.rating2,R.string.ratingcount2),
            Spot(R.string.spot15,R.drawable.raja5,R.string.rating3,R.string.ratingcount3),
            Spot(R.string.spot16,R.drawable.raja4,R.string.rating4,R.string.ratingcount4))
    }

    fun loadMumbaiSpots(): List<Spot> {
        return listOf(
            Spot(R.string.spot6, R.drawable.mumbai1, R.string.rating1, R.string.ratingcount1),
            Spot(R.string.spot7, R.drawable.mumbai3, R.string.rating2, R.string.ratingcount3),
            Spot(R.string.spot8, R.drawable.mumbai2, R.string.rating3, R.string.ratingcount3),
            Spot(R.string.spot9, R.drawable.mumbai4, R.string.rating4, R.string.ratingcount4)
        )
    }

    fun loadSevenSisterSpots():List<Spot>{
        return listOf(
            Spot(R.string.spot10, R.drawable.seven1,R.string.rating1,R.string.ratingcount1),
            Spot(R.string.spot11, R.drawable.seven2,R.string.rating2,R.string.ratingcount2),
            Spot(R.string.spot12, R.drawable.seven3,R.string.rating2,R.string.ratingcount2),
        )

    }
}