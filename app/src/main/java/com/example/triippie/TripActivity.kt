package com.example.triippie

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.triippie.adapter.PlaceAdapter

import com.example.triippie.model.Datasource


class TripActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trip)
        val dataset=Datasource().loadPlaces()
        val recyclerView=findViewById<RecyclerView>(R.id.place_recycler_view)
        var adapter=PlaceAdapter(this,dataset)
        recyclerView.adapter= adapter
        recyclerView.setHasFixedSize(true)

        var t = Intent(this, SpotActivity::class.java)

       adapter.setPlaceClickListener(object :PlaceAdapter.PlaceClickListener{
           override fun onPlaceClick(position: Int) {
              if(position==0){

                  t.putExtra("position","0")
                  t.putExtra("heading","Places to Visit In Kota")
           }
               else{

                  t.putExtra("position","1")
                  t.putExtra("heading","Places to Visit In Kashmir")
              }
               startActivity(t)
       }
       })

        }


}


