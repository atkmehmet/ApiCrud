package com.example.apicrud.remote.models

data class AuthDto(

    val id:String,
    val username: String,
    val email: String,
    val firstName: String,
    val lastName: String,
    val gender: String,
    val image: String,
    val accessToken: String,
    val refreshToken: String

){
    companion object {
        val EMPTY = AuthDto(
            id = "",
            username = "",
            email = "",
            firstName = "",
            lastName = "",
            gender = "",
            image = "",
            accessToken = "",
            refreshToken = ""
        )
    }
}
