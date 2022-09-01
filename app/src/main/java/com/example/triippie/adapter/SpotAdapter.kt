package com.example.triippie.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.triippie.R
import com.example.triippie.model.Spot

class SpotAdapter(private val context: Context, private val dataset:List<Spot>):
RecyclerView.Adapter<SpotAdapter.SpotViewHolder>(){
    private lateinit var mListener:SpotClickListener
    interface SpotClickListener{
        fun onSpotClick(pos:Int)
    }
    fun setSpotClickListener(listener:SpotClickListener){
        mListener=listener
    }
    class SpotViewHolder(view: View,listener: SpotClickListener): RecyclerView.ViewHolder(view){
        val textView: TextView =view.findViewById(R.id.place_title)
        val imageView: ImageView =view.findViewById(R.id.spotImage)
        val rating:TextView=view.findViewById(R.id.rating)
        val ratingCount:TextView=view.findViewById(R.id.ratingcount)
        init{
            itemView.setOnClickListener {
                listener.onSpotClick(adapterPosition)
            }
        }

    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpotViewHolder {
        val adapterLayout=
            LayoutInflater.from(parent.context).inflate(R.layout.activity_spot_card,parent,false)
        return SpotViewHolder(adapterLayout,mListener)

    }
    override fun onBindViewHolder(holder: SpotViewHolder, position: Int) {
        val spot=dataset[position]
        holder.textView.text=context.resources.getString(spot.stringResourceId)
        holder.imageView.setImageResource(spot.imageResourceId)
        holder.rating.text=context.resources.getString(spot.ratingResourceId)
        holder.ratingCount.text=context.resources.getString(spot.ratingCountResourceId)


    }

}
