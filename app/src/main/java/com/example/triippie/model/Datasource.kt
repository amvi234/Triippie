package com.example.triippie.model

import com.example.triippie.R

class Datasource {
    fun loadPlaces():List<Places>{
        return listOf(Places(R.string.place1,R.drawable.raja1),
            Places(R.string.place2,R.drawable.mumbai1),
            Places(R.string.place3,R.drawable.tulip1),
            Places(R.string.place4,R.drawable.seven1)
            )
    }
}