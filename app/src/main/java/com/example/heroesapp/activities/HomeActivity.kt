package com.example.heroesapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.adapters.CategoryAdapter
import com.example.heroesapp.adapters.HeroesDetailActivity
import com.example.heroesapp.adapters.PublisherAdapter
import com.example.heroesapp.models.Category
import com.example.heroesapp.models.Heroe
import com.example.heroesapp.models.Publisher
import com.example.heroesapp.models.User


class HomeActivity : AppCompatActivity() {
    lateinit var usernameTV : TextView
    lateinit var logoutBtn : ImageView

    lateinit var categoryRecyclerView: RecyclerView
    lateinit var heroesRecyclerView: RecyclerView
    lateinit var publisherRecyclerView: RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
        usernameTV = findViewById(R.id.usernameTV)
        logoutBtn = findViewById(R.id.logoutBtn)

        categoryRecyclerView = findViewById(R.id.category_recycleview)
        heroesRecyclerView = findViewById(R.id.heroes_recyclerview)
        publisherRecyclerView = findViewById(R.id.best_heroes_recycleview)

        categoryRecyclerView.adapter = CategoryAdapter(Category.categories)
        categoryRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        publisherRecyclerView.adapter = PublisherAdapter(Heroe.heroes) { publisher ->
            Log.i("publisher desde Home", publisher.name)
            val intent = Intent(this@HomeActivity,PublisherActivity::class.java)
            intent.putExtra("publisherId",publisher.id)
            startActivity(intent)

        }
        publisherRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)

        heroesRecyclerView.adapter = HeroesDetailActivity(Heroe.heroes) {heroe: Heroe -> // la funcion lambda que navegue a la otra activity
            val intent = Intent(this@HomeActivity,HeroesDetailActivity::class.java)
            intent.putExtra("heroeId",heroe.id)
            startActivity(intent)
        }

        heroesRecyclerView.layoutManager = GridLayoutManager(this, 2)

        val user = User.users[1]
        usernameTV.text = user.computedName
        logoutBtn.setOnClickListener {
            Log.i("LOGOUT","Cerrando sesion")
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@HomeActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}