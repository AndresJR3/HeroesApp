package com.example.heroesapp.models

data class Publisher( val id: Int, val name : String, val image: String){
    companion object{
        val publisher = mutableListOf(
            Publisher(1, "Marvel", "https://1000marcas.net/wp-content/uploads/2021/07/Marvel-Comics-logo.png"),
            Publisher(2, "DC", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/DC_Comics_logo.svg/800px-DC_Comics_logo.svg.png")
        )
    }
}
