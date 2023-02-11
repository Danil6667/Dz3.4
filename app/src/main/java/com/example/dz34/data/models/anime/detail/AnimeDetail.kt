package com.example.dz34.data.models.anime.detail

import com.example.dz34.data.models.anime.Anime
import com.google.gson.annotations.SerializedName

data class AnimeDetail(
    @SerializedName("data")
    val data: Anime
)