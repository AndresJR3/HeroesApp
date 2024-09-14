package com.example.heroesapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.adapters.HeroesDetailActivity
import com.example.heroesapp.models.Heroe

class PublisherActivity : AppCompatActivity() {
    lateinit var publisherTitle : TextView
    lateinit var heroesRecyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroe)

        publisherTitle = findViewById(R.id.publisher_title)
        heroesRecyclerView = findViewById(R.id.heroe_recyclerview)

        val HeroesId = intent.getIntExtra("restaurantId",0) // la llave con la que pasamos nuestro id
        Log.i("RestaurantActivity","El Id que me pasaron es: ${HeroesId}")

        val heroe = Heroe.heroes.firstOrNull { heroe ->
            heroe.id == HeroesId
        }
        Log.i("PublisherActivity",heroe.toString())
        publisherTitle.text = heroe?.name
        val heroes = Heroe.heroes.filter { heroe ->
            heroe.PublisherId == HeroesId
        }
        Log.i("PublisherActivity",heroe.toString())
        heroesRecyclerView.adapter = HeroesDetailActivity(heroes){ heroe->
            val intent = Intent(this@PublisherActivity,HeroesActivity::class.java)
            intent.putExtra("heroeId",heroe.id)
            startActivity(intent)
        }
        heroesRecyclerView.layoutManager = GridLayoutManager(this,2)
    }
}