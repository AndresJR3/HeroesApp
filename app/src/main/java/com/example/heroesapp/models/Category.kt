package com.example.heroesapp.models

import android.media.Image

data class Category( val id : Int, val name: String, val image: String){
    companion object{
        val categories = mutableListOf<Category>(
            Category(1,"Biológico","https://cdn.pixabay.com/photo/2012/04/12/13/49/biohazard-symbol-30106_960_720.png"),
            Category(2,"Fuerza","https://cdn.pixabay.com/photo/2017/02/01/10/17/arm-2029406_1280.png"),
            Category(3,"Ciencia","https://cdn.pixabay.com/photo/2022/06/09/13/16/atom-7252556_1280.png"),
            Category(4,"Inteligencia","https://cdn.pixabay.com/photo/2017/10/12/20/39/brain-2845862_1280.png"),
            Category(5,"Superhumano","https://cdn.pixabay.com/photo/2017/10/12/21/51/heart-2846113_1280.png"),
        )
    }

}
