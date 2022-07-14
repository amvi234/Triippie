package com.example.triippie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
//import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_history.*
import kotlinx.android.synthetic.main.activity_main.*

class HistoryActivity : AppCompatActivity(), ITripsRVAdapter {

    lateinit var viewModel: TripViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        recyclerView.layoutManager=LinearLayoutManager(this)
        val adapter = TripsRVAdapter(this,this)
        recyclerView.adapter=adapter

        viewModel = ViewModelProvider(this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(application)).get(TripViewModel::class.java)
        viewModel.allTrips.observe(this, Observer {list ->
            list?.let{
                adapter.updateList(it)
            }

        })


    }

    override fun onItemClicked(trip: Trip) {
        viewModel.deleteTrip(trip)
        Toast.makeText(this,"${trip.text} Deleted",Toast.LENGTH_LONG).show()


    }

    fun submitData(view: View) {
        val tripText = input.text.toString()
        if(tripText.isNotEmpty()){
            viewModel.insertTrip(Trip(tripText))
        }
    }
}