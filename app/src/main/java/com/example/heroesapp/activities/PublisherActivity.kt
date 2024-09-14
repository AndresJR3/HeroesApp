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
import com.example.heroesapp.adapters.HeroeAdapter
import com.example.heroesapp.adapters.PublisherAdapter
import com.example.heroesapp.models.Heroe
import com.example.heroesapp.models.Publisher

class PublisherActivity : AppCompatActivity() {
    lateinit var publisherTitle : TextView
    lateinit var heroesRecyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_publisher)

        publisherTitle = findViewById(R.id.publisher_title)
        heroesRecyclerView = findViewById(R.id.heroe_recyclerview)

        val publisherId = intent.getIntExtra("publisherId",0) // la llave con la que pasamos nuestro id
        Log.i("PublisherActivity","El Id que me pasaron es: ${publisherId}")

        val publisher = Publisher.publisher.firstOrNull { publisher ->
            publisher.id == publisherId
        }
        Log.i("PublisherActivity",publisher.toString())
        publisherTitle.text = publisher?.name
        val heroes = Heroe.heroes.filter { heroe ->
            heroe.publisherId == publisherId
        }
        Log.i("PublisherActivity",heroes.toString())
        heroesRecyclerView.adapter = HeroeAdapter(heroes){ heroe->
            val intent = Intent(this@PublisherActivity,HeroesActivity::class.java)
            intent.putExtra("heroeId",heroe.id)
            startActivity(intent)
        }
        heroesRecyclerView.layoutManager = GridLayoutManager(this,2)
    }
}