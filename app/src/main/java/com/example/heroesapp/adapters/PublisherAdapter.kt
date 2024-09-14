package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesapp.R
import com.example.heroesapp.models.Heroe
import com.example.heroesapp.models.Publisher
import com.squareup.picasso.Picasso

class PublisherAdapter(
    val heroesList: MutableList<Publisher>,
    val onClick: (Publisher)->Unit) : RecyclerView.Adapter<PublisherViewHolder>(){ //Para activar el método
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item,parent,false)
        return PublisherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroesList.count()
    }

    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        val publisher = heroesList[position]
        holder.heroeName.text = publisher.name
        Picasso.get().load(publisher.image).into(holder.publisherImage)

        holder.itemView.setOnClickListener {
            onClick(publisher)
        }
    }

}

class PublisherViewHolder(view: View): ViewHolder(view){
    val publisherImage : ImageView = view.findViewById(R.id.publisher_image)
    val heroeName : TextView = view.findViewById(R.id.publisher_name)
}