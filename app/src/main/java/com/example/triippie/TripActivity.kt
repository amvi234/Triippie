package com.example.triippie

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils


import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.RecyclerView
import com.example.triippie.adapter.PlaceAdapter

import com.example.triippie.model.Datasource



class TripActivity : AppCompatActivity() {
    private lateinit var animfrombutton: Animation
    private lateinit var animfromtop:Animation
    private lateinit var animfromleft:Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browse_places)
        val dataset=Datasource().loadPlaces()
        val recyclerView=findViewById<RecyclerView>(R.id.place_recycler_view)
        val adapter=PlaceAdapter(this,dataset)
        recyclerView.adapter= adapter
        recyclerView.setHasFixedSize(true)

        //Load Animations
        animfrombutton = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom)
        animfromtop = AnimationUtils.loadAnimation(this, R.anim.anim_from_top)
        animfromleft = AnimationUtils.loadAnimation(this, R.anim.anim_from_left)


        val textView:TextView = findViewById(R.id.firstText)
        val textView2 :TextView = findViewById(R.id.textView)
        val textView3 :TextView = findViewById(R.id.textView2)
        val textView4 :TextView = findViewById(R.id.textView3)
        val textView5 :TextView = findViewById(R.id.textView4)


        //Set Animations


        textView.animation = animfromtop
        textView2.animation = animfromtop
        textView3.animation = animfromtop
        textView4.animation = animfromtop
        textView5.animation = animfromtop

        val t = Intent(this, SpotActivity::class.java)

       adapter.setPlaceClickListener(object :PlaceAdapter.PlaceClickListener{
           override fun onPlaceClick(position: Int) {
               when (position) {
                   0 -> {

                       t.putExtra("position","0")
                       t.putExtra("heading","Famous Places In Rajasthan")
                   }
                   1 -> {

                       t.putExtra("position","1")
                       t.putExtra("heading","Famous Places In Mumbai")
                   }
                   2 -> {

                       t.putExtra("position","2")
                       t.putExtra("heading","Famous Places In Kashmir")
                   }
                   else -> {

                       t.putExtra("position","3")
                       t.putExtra("heading","Famous Places In Seven Sister")

                   }
               }
               startActivity(t)
       }
       })

        }


}


