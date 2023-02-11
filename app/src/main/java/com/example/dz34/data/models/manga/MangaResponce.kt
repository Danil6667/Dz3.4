package com.example.dz34.data.models.manga

import com.example.dz34.data.models.anime.Links
import com.google.gson.annotations.SerializedName

data class MangaResponce<T>(
    @SerializedName("data")
    val data: List<T>,
    @SerializedName("links")
    val links: Links
)