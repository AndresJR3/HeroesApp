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
import com.squareup.picasso.Picasso

class PublisherAdapter(val heroesList : List<Heroe>, val onClick : (Heroe)->Unit) : RecyclerView.Adapter<PublisherViewHolder>(){ //Para activar el método
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.heroe_item,parent,false)
        return PublisherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroesList.count()
    }

    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        val heroe = heroesList[position]
        holder.heroeName.text = heroe.name
        Picasso.get().load(heroe.image).into(holder.heroeImage)

        holder.itemView.setOnClickListener {
            onClick(heroe)
        }
    }

}

class PublisherViewHolder(view: View): ViewHolder(view){
    val heroeImage : ImageView = view.findViewById(R.id.heroe_image)
    val heroeName : TextView = view.findViewById(R.id.heroe_name)
}