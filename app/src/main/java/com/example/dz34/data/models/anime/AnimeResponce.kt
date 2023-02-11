package com.example.dz34.data.models.anime

import com.google.gson.annotations.SerializedName

data class AnimeResponce<T>(
    @SerializedName("data")
    val data: List<T>,
    @SerializedName("links")
    val links: Links
)