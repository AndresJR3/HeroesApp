package com.example.heroesapp.activities

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.heroesapp.R
import com.example.heroesapp.models.Heroe
import com.squareup.picasso.Picasso

class HeroesActivity : AppCompatActivity() {

    lateinit var heroesTextView: TextView
    lateinit var heroesDescription : TextView
    lateinit var heroesImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroe_detail)

        heroesTextView = findViewById(R.id.heroe_title)
        heroesDescription = findViewById(R.id.heroe_description)
        heroesImageView = findViewById(R.id.heroe_image)

        val heroeId = intent.getIntExtra("heroeId", 0)

        val heroe = Heroe.heroes.firstOrNull { heroe: Heroe -> heroe.id == heroeId }

        heroesTextView.text = heroe?.name
        heroesDescription.text = heroe?.description
        Picasso.get().load(heroe?.image).into(heroesImageView)



    }
}