package com.example.triippie.model

import android.widget.RatingBar
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Spot(@StringRes val stringResourceId: Int,
                @DrawableRes val imageResourceId:Int,
                @StringRes val ratingResourceId: Int,
                @StringRes val ratingCountResourceId:Int)

