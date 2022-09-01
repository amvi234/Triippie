package com.example.triippie

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class LocationActivity: AppCompatActivity() {
    private lateinit var animfrombutton: Animation
    private lateinit var animfromtop: Animation
    private lateinit var animfromleft: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_state)


        //Load Animations
        animfrombutton = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom)
        animfromtop = AnimationUtils.loadAnimation(this, R.anim.anim_from_top)
        animfromleft = AnimationUtils.loadAnimation(this, R.anim.anim_from_left)

        val cardView: CardView = findViewById(R.id.placeView)
        val placetext: TextView = findViewById(R.id.place_title)
        val imageView: ImageView = findViewById(R.id.place_img)


        //Set Animations
        cardView.animation = animfrombutton
        placetext.animation = animfromtop
        imageView.animation = animfromtop
    }
}