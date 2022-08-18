package com.rakhmatkhaidir.githubuserapp.data.model

data class ResponseDetailUser(
    val avatar_url: String,
    val followers: Int,
    val following: Int,
    val id: Int,
    val login: String,
    val name: String,
)