package com.example.heroesapp.models

import android.media.Image

data class Category( val id : Int, val name: String, val image: String){
    companion object{
        val categories = mutableListOf<Category>(
            Category(1,"Biológico","https://static.vecteezy.com/system/resources/thumbnails/019/607/567/small_2x/fast-food-vector-clipart-design-graphic-clipart-design-free-png.png"),
            Category(2,"Fuerza","https://www.flaticon.es/icono-gratis/fuerza_4419256?term=fuerzas&page=1&position=8&origin=search&related_id=4419256.png"),
            Category(3,"Ciencia","https://www.flaticon.es/icono-gratis/ciencia_2131009.png"),
            Category(4,"Inteligencia","https://www.flaticon.es/icono-gratis/administracion_2683325?term=inteligencia&page=2&position=33&origin=search&related_id=2683325.png"),
            Category(5,"Superhumano","https://www.pngwing.com/es/free-png-hlozg.png"),
        )
    }

}
