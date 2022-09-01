package com.example.triippie

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.triippie.model.SpotDetailDatasource


class MoreDetailActivity: AppCompatActivity() {
    private lateinit var backarrow: ImageView
    private lateinit var title: TextView
    private lateinit var about: TextView
    private lateinit var rating: TextView
    private lateinit var ratingcount: TextView
    private lateinit var view: TextView
    private lateinit var timing: TextView
    private lateinit var price: TextView
    private lateinit var bg:ImageView

    private lateinit var fromleft: Animation
    private lateinit var fromright: Animation
    private lateinit var frombottom: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spot_depth_detail)
        val bundle: Bundle? = intent.extras

        backarrow = findViewById(R.id.down_arrow)

        bg = findViewById(R.id.bg_final)
        title = findViewById(R.id.third_title)
       about = findViewById(R.id.about_text)
      rating = findViewById(R.id.third_rating_number)
        ratingcount = findViewById(R.id.third_rating_number2)
      price= findViewById(R.id.price_text)
     view = findViewById(R.id.view_text)
        timing = findViewById(R.id.timing_text)

//
        backarrow.setOnClickListener {
            val intent = Intent(this, SpotActivity::class.java)
            startActivity(intent)
        }
        val index=bundle!!.getInt("index")

      title.text = getString(SpotDetailDatasource().loadSpotTitle(index))
       about.text =getString(SpotDetailDatasource().loadSpotAbout(index))
        rating.text =getString(SpotDetailDatasource().loadSpotRating(index))
        ratingcount.text =getString(SpotDetailDatasource().loadSpotReview(index))
        bg.setImageResource(SpotDetailDatasource().loadSpotImage(index))
        price.text =getString(SpotDetailDatasource().loadSpotPrice(index))
        timing.text=getString(SpotDetailDatasource().loadSpotTiming(index))
        view.text=getString(SpotDetailDatasource().loadView(index))


        //Load Animations
        fromleft = AnimationUtils.loadAnimation(this, R.anim.anim_from_left)
        fromright = AnimationUtils.loadAnimation(this, R.anim.anim_from_right)
        frombottom = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom)


        //Set Animations


        //Set Animations
     backarrow.animation = fromleft
       title.animation = fromright
       about.animation = fromright
        rating.animation = fromleft
      ratingcount.animation = fromright
        price.animation = fromright
        view.animation = frombottom
        timing.animation = frombottom





    }


}