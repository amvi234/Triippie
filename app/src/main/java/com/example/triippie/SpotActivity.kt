package com.example.triippie


import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.RecyclerView

import com.example.triippie.adapter.SpotAdapter
import com.example.triippie.model.SpotDataSource
import com.example.triippie.model.Spot

class SpotActivity : AppCompatActivity() {

    private lateinit var animfromtop: Animation

    private lateinit var place:TextView
    private lateinit var dataset:List<Spot>
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_browse_spots)
            val bundle:Bundle?=intent.extras
            place=findViewById(R.id.place)
            animfromtop = AnimationUtils.loadAnimation(this, R.anim.anim_from_top)
            place.animation = animfromtop
            val position=bundle!!.getString("position")
            val heading=bundle!!.getString("heading")
            place.text=heading
            dataset = when (position) {
                "0" -> {
                    SpotDataSource().loadKotaSpots()
                }
                "1" -> {
                    SpotDataSource().loadMumbaiSpots()
                }
                "2" -> {
                    SpotDataSource().loadKashmirSpots()
                }
                else -> {
                    SpotDataSource().loadSevenSisterSpots()
                }
            }
            val recyclerView=findViewById<RecyclerView>(R.id.spot_recycler_view)
            val adapter=SpotAdapter(this,dataset)
            recyclerView.adapter= adapter
            recyclerView.setHasFixedSize(true)
            val t= Intent(this,SpotDetailActivity::class.java)
            adapter.setSpotClickListener(object:SpotAdapter.SpotClickListener{
                override fun onSpotClick(pos: Int) {
                    when(position){
                        "0"-> {
                            when (pos) {
                                0 -> {
                                    t.putExtra("index", 0)
                                }
                                1 -> {
                                    t.putExtra("index", 1)
                                }
                                2 -> {
                                    t.putExtra("index", 2)
                                }
                                else-> {
                                    t.putExtra("index", 3)
                                }
                            }
                        }
                            "1"->{
                            when(pos){
                                0->{
                                    t.putExtra("index",4)
                                }
                                1->{
                                    t.putExtra("index",5)
                                }
                                2-> {
                                    t.putExtra("index", 6)
                                }

                                else-> {
                                    t.putExtra("index", 7)
                                }
                            }
                        }
                        "2"->{
                            when(pos){
                                0->{
                                    t.putExtra("index",8)
                                }
                                1->{
                                    t.putExtra("index",9)
                                }
                                2-> {
                                    t.putExtra("index", 10)
                                }
                                3-> {
                                    t.putExtra("index", 11)
                                }

                                else-> {
                                    t.putExtra("index", 12)
                                }
                            }
                        }
                        else->{
                            when(pos){
                                0->{
                                    t.putExtra("index",13)
                                }
                                1->{
                                    t.putExtra("index",14)
                                }
                                2-> {
                                    t.putExtra("index", 15)
                                }
                                else-> {
                                    t.putExtra("index", 16)
                                }
                            }
                        }
                    }
                    startActivity(t)
                }
            })

        }
    }



