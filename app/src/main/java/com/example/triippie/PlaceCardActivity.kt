package com.example.triippie

import android.os.Bundle
import android.view.animation.Animation
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.cardview.widget.CardView

import androidx.appcompat.app.AppCompatActivity
import android.view.animation.AnimationUtils


class PlaceCardActivity :AppCompatActivity() {
    private lateinit var animfrombutton: Animation
    private lateinit var animfromtop: Animation
    private lateinit var animfromleft: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spot_card)
        animfrombutton = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom)
        animfromtop = AnimationUtils.loadAnimation(this, R.anim.anim_from_top)
        animfromleft = AnimationUtils.loadAnimation(this, R.anim.anim_from_left)
        val spotView:CardView=findViewById(R.id.spotView)
        val textView: TextView = findViewById(R.id.place_title)
        val image : ImageView = findViewById(R.id.spotImage)
        val textView3 : TextView = findViewById(R.id.rating)
        val textView4 : TextView = findViewById(R.id.ratingcount)
        val textView5 : RatingBar = findViewById(R.id.ratingBar1)
        spotView.animation = animfrombutton
        textView.animation = animfromleft
        image.animation = animfrombutton
        textView3.animation=animfromtop
        textView4.animation=animfromtop
        textView5.animation=animfromtop


    }
}