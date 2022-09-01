package com.example.triippie.model


import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SpotDetail(@StringRes val titleResourceId: Int, @DrawableRes val imageResourceId:Int, @StringRes val ratingResourceId: Int, @StringRes val ratingCountResourceId:Int, @StringRes val aboutResourceId: Int, @StringRes val priceResourceId:Int, @StringRes val timingResourceId: Int, @StringRes val viewResourceId:Int)
