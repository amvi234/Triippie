package com.example.triippie


import android.content.Intent
import android.os.Bundle

import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import com.example.triippie.model.SpotDetailDatasource

class SpotDetailActivity : AppCompatActivity() {


    private lateinit var secondbackarrow: ImageView
    private lateinit var secondarrowup: ImageView
    private lateinit var bg: ImageView
    private lateinit var secondtitle: TextView
    private lateinit var secondsubtitle: TextView
    private lateinit var secondratingnumber: TextView
    private lateinit var secondratingnumber2: TextView
    private lateinit var moredetails: TextView
    private lateinit var secondratingbar: RatingBar

    private lateinit var fromleft: Animation
    private lateinit var fromright: Animation
    private lateinit var frombottom: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spot_detail)
        val bundle: Bundle? = intent.extras

        secondbackarrow = findViewById(R.id.second_back_arrow)
        secondarrowup = findViewById(R.id.seconf_arrow_up)
        bg = findViewById(R.id.bg)
        secondtitle = findViewById(R.id.spot_title)
        secondsubtitle = findViewById(R.id.spot_subtitle)
        secondratingnumber = findViewById(R.id.spot_rating_number)
        secondratingnumber2 = findViewById(R.id.review_count)
        moredetails = findViewById(R.id.more_details)
        secondratingbar = findViewById(R.id.spot_ratingbar)

//
        secondbackarrow.setOnClickListener {
            val intent = Intent(this, TripActivity::class.java)
            startActivity(intent)
        }
        val index=bundle!!.getInt("index")
//        val spotdetail=SpotDetailDatasource().loadSpotDetail(index)
//
//
//        secondtitle.text = spotdetail.titleResourceId.toString()
//        secondsubtitle.text =spotdetail.aboutResourceId.toString()
//        secondratingnumber.text = spotdetail.ratingResourceId.toString()
//        secondratingnumber2.text = spotdetail.ratingCountResourceId.toString()


        secondtitle.text = getString(SpotDetailDatasource().loadSpotTitle(index))
        secondsubtitle.text =getString(SpotDetailDatasource().loadSpotAbout(index))
        secondratingnumber.text =getString(SpotDetailDatasource().loadSpotRating(index))
        secondratingnumber2.text =getString(SpotDetailDatasource().loadSpotReview(index))
        bg.setImageResource(SpotDetailDatasource().loadSpotImage(index))


        //Load Animations
        fromleft = AnimationUtils.loadAnimation(this, R.anim.anim_from_left)
        fromright = AnimationUtils.loadAnimation(this, R.anim.anim_from_right)
        frombottom = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom)


        //Set Animations


        //Set Animations
        secondbackarrow.animation = fromleft
        secondtitle.animation = fromright
        secondsubtitle.animation = fromright
        secondratingbar.animation = fromleft
        secondratingnumber.animation = fromright
        secondratingnumber2.animation = fromright
       secondarrowup.animation = frombottom
        moredetails.animation = frombottom



        secondarrowup.setOnClickListener {
            val intent = Intent(this, MoreDetailActivity::class.java)
            intent.putExtra("index",index)
            startActivity(intent)

        }

    }
}
