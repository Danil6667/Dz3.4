package com.example.dz34.data.models.manga

import com.example.dz34.data.models.anime.PosterImage
import com.example.dz34.data.models.anime.Titles
import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("description")
    val description: String = "",
    @SerializedName("posterImage")
    val posterImage: PosterImage,
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("status")
    val status: String = ""
)