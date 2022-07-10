package com.example.triippie

import android.content.Context
import android.view.LayoutInflater
import android.view.OnReceiveContentListener
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class TripsRVAdapter(private val context: Context, private val listener: ITripsRVAdapter): RecyclerView.Adapter<TripsRVAdapter.TripViewHolder>() {
    private val allTrips = ArrayList<Trip>()

    inner class TripViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val textView:TextView = itemView.findViewById<TextView>(R.id.text)
        val deleteButton:ImageView= itemView.findViewById<ImageView>(R.id.delete)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripViewHolder {
        val viewHolder=TripViewHolder(LayoutInflater.from(context).inflate(R.layout.item_trip,parent,false))
        viewHolder.deleteButton.setOnClickListener{
            listener.onItemClicked(allTrips[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: TripViewHolder, position: Int) {
        val currentTrip = allTrips[position]
        holder.textView.text = currentTrip.text
    }

    override fun getItemCount(): Int {
        return allTrips.size
    }
    fun updateList(newList: List<Trip>){
        allTrips.clear()
        allTrips.addAll(newList)

        notifyDataSetChanged()
    }

}
interface ITripsRVAdapter{
    fun onItemClicked(trip:Trip)
}