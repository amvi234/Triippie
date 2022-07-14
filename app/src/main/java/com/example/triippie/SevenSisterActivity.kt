package com.example.triippie

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.triippie.adapter.PlaceAdapter
import com.example.triippie.adapter.SpotAdapter
import com.example.triippie.model.SevenSisterData
import kotlinx.android.synthetic.main.activity_trip_plan.*

class SevenSisterActivity:AppCompatActivity() {
    private lateinit var place:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trip_plan)
        place=findViewById(R.id.place)
        place.text="Places to Visit in Seven Sister"
        val dataset= SevenSisterData().loadSpots()
        val recyclerView=findViewById<RecyclerView>(R.id.spot_recycler_view)
        recyclerView.adapter= SpotAdapter(this,dataset)
        recyclerView.setHasFixedSize(true)

    }
}