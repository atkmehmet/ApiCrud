package com.example.apicrud.remote.models

data class Self(

     val id: String,
     val username: String,
     val email: String,
     val firstName: String,
     val lastName: String,
     val gender: String,
     val image: String
){
    companion object{
        val EMPTY = Self(
            id = "",
            username = "",
            email = "",
            firstName = "",
            lastName = "",
            gender = "",
            image = ""
        )
    }
}
