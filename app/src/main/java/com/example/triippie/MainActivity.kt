package com.example.triippie

import android.content.Intent
import android.widget.Button


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    private lateinit var plantrip: Button
    private lateinit var iternary: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plantrip = findViewById(R.id.trip)
        iternary = findViewById(R.id.itenary)
        plantrip.setOnClickListener {
            val t = Intent(this, TripActivity::class.java)
            startActivity(t)
        }
        iternary.setOnClickListener {
            val t = Intent(this, HistoryActivity::class.java)
            startActivity(t)
        }
    }
}