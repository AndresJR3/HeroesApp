package com.example.heroesapp.models

data class User (val name : String , val email: String, val password : String) {
    val computedName : String get() = "Hola, $name"
    companion object{
        val users = listOf(
            User("Juan","juanfr97@hotmail.com","12345"),
            User("Andres","andres98@hotmail.com","12345"),
            User("Luisa","Luisa99@hotmail.com","12345")
        )
    }
}