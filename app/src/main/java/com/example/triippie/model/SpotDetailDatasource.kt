package com.example.triippie.model

import com.example.triippie.R

class SpotDetailDatasource{

    private val title= arrayOf(
            R.string.spot13,
                R.string.spot14,
                    R.string.spot15,
                        R.string.spot16,
            R.string.spot6,
            R.string.spot7,
            R.string.spot8,
            R.string.spot9,
            R.string.spot1,
            R.string.spot2,
            R.string.spot3,
            R.string.spot4,
        R.string.spot5,
             R.string.spot10,
                R.string.spot11,
                    R.string.spot12
        )
    private val image= arrayOf(
       R.drawable.raja,
       R.drawable.raja1,
        R.drawable.raja5,
        R.drawable.raja4,
        R.drawable.mumbai1,
         R.drawable.mumbai3,
         R.drawable.mumbai2,
        R.drawable.mumbai4,
         R.drawable.kashmir2,
        R.drawable.kashmir3,
         R.drawable.tulip1,
         R.drawable.kashmir5,
        R.drawable.kashmir4,
        R.drawable.seven1,
        R.drawable.seven2,
        R.drawable.seven3)

    private val rating= arrayOf(
       R.string.rating1,
       R.string.rating2,
       R.string.rating3,
      R.string.rating4,
       R.string.rating1,
        R.string.rating2,
       R.string.rating3,
      R.string.rating4,
       R.string.rating1,
         R.string.rating2,
      R.string.rating3,
       R.string.rating4,
       R.string.rating5,
    R.string.rating1,
       R.string.rating2,
       R.string.rating2,
    )
    private val ratingCount= arrayOf(
       R.string.ratingcount1,
   R.string.ratingcount2,
   R.string.ratingcount3,
    R.string.ratingcount4,
   R.string.ratingcount1,
   R.string.ratingcount3,
    R.string.ratingcount4,
    R.string.ratingcount1,
    R.string.ratingcount2,
    R.string.ratingcount3,
    R.string.ratingcount4,
     R.string.ratingcount5,
   R.string.ratingcount1,
 R.string.ratingcount2,
 R.string.ratingcount2, R.string.rating1
    )
    private val about= arrayOf(
       R.string.about13,
   R.string.about14,
   R.string.about15,
  R.string.about16,
    R.string.about6,
  R.string.about7,
R.string.about8,
   R.string.about9,
    R.string.about1,
    R.string.about2,
   R.string.about3,
    R.string.about4,
    R.string.about5,
    R.string.about10,
    R.string.about11,
 R.string.about12
    )

    private val price= arrayOf(
        R.string.price13,
    R.string.price14,
    R.string.price15,
    R.string.price16,
    R.string.price6,
    R.string.price7,
   R.string.price8,
    R.string.price9,
    R.string.price1,
        R.string.price2,
        R.string.price3,
        R.string.price4,
        R.string.price5,
        R.string.price10,
        R.string.price11,
        R.string.price12
    )


    private val timing= arrayOf(
       R.string.timing13,
   R.string.timing14,
    R.string.timing15,
    R.string.timing16,
   R.string.timing6,
   R.string.timing7,
   R.string.timing8,
    R.string.timing9,
    R.string.timing1, R.string.timing2,
        R.string.timing3,
        R.string.timing4,
        R.string.timing5,
        R.string.timing10,
        R.string.timing11,
        R.string.timing12)

    private val view= arrayOf(
      R.string.view13,
    R.string.view14,
    R.string.view15,
    R.string.view16,
    R.string.view6,
    R.string.view7,
    R.string.view8,
    R.string.view9,
    R.string.view1,
    R.string.view2,
    R.string.view3,
    R.string.view4,
    R.string.view5,
    R.string.view10,
    R.string.view11,
    R.string.view12
    )
//    private val spotdetail= arrayOf(
//        R.string.spot13,R.drawable.raja,R.string.rating1,R.string.ratingcount1,R.string.about13,R.string.price13,R.string.timing13,R.string.view13),
//        R.string.spot14,R.drawable.raja1,R.string.rating2,R.string.ratingcount2,R.string.about14,R.string.price14,R.string.timing14,R.string.view14),
//        R.string.spot15,R.drawable.raja5,R.string.rating3,R.string.ratingcount3,R.string.about15,R.string.price15,R.string.timing15,R.string.view15),
//        R.string.spot16,R.drawable.raja4,R.string.rating4,R.string.ratingcount4,R.string.about16,R.string.price16,R.string.timing16,R.string.view16),
//        R.string.spot6, R.drawable.mumbai1, R.string.rating1, R.string.ratingcount1,R.string.about6,R.string.price6,R.string.timing6,R.string.view6),
//        R.string.spot7, R.drawable.mumbai3, R.string.rating2, R.string.ratingcount3,R.string.about7,R.string.price7,R.string.timing7,R.string.view7),
//        R.string.spot8, R.drawable.mumbai2, R.string.rating3, R.string.ratingcount3,R.string.about8,R.string.price8,R.string.timing8,R.string.view8),
//        R.string.spot9, R.drawable.mumbai4, R.string.rating4, R.string.ratingcount4,R.string.about9,R.string.price9,R.string.timing9,R.string.view9),
//        R.string.spot1, R.drawable.kashmir2, R.string.rating1, R.string.ratingcount1,R.string.about1,R.string.price1,R.string.timing1,R.string.view1),
//        R.string.spot2, R.drawable.kashmir3, R.string.rating2, R.string.ratingcount2,R.string.about2,R.string.price2,R.string.timing2,R.string.view2),
//        R.string.spot3, R.drawable.tulip1, R.string.rating3, R.string.ratingcount3,R.string.about3,R.string.price3,R.string.timing3,R.string.view3),
//        R.string.spot4, R.drawable.kashmir5, R.string.rating4, R.string.ratingcount4,R.string.about4,R.string.price4,R.string.timing4,R.string.view4),
//        R.string.spot5, R.drawable.kashmir4, R.string.rating5, R.string.ratingcount5,R.string.about5,R.string.price5,R.string.timing5,R.string.view5),
//        R.string.spot10, R.drawable.seven1,R.string.rating1,R.string.ratingcount1,R.string.about10,R.string.price10,R.string.timing10,R.string.view10),
//        R.string.spot11, R.drawable.seven2,R.string.rating2,R.string.ratingcount2,R.string.about11,R.string.price11,R.string.timing11,R.string.view11),
//        R.string.spot12, R.drawable.seven3,R.string.rating2,R.string.ratingcount2,R.string.about12,R.string.price12,R.string.timing12,R.string.view12)
//    )
    
    
    fun loadSpotTitle(index:Int): Int {
        return title[index]
    }
    fun loadSpotImage(index:Int): Int {
        return image[index]
    }
    fun loadSpotAbout(index:Int): Int {
        return about[index]
    }
    fun loadSpotRating(index:Int): Int {
        return rating[index]
    }
    fun loadSpotReview(index:Int): Int {
        return ratingCount[index]
    }
    fun loadSpotPrice(index:Int): Int {
        return price[index]
    }
    fun loadSpotTiming(index:Int): Int {
        return timing[index]
    }
    fun loadView(index:Int): Int {
        return view[index]
    }

//    fun loadSpotPrice(index:Int): Int {
//        return price[index]
//    }


    }


