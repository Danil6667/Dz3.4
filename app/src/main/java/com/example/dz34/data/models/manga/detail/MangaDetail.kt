package com.example.dz34.data.models.manga.detail

import com.example.dz34.data.models.manga.Manga
import com.google.gson.annotations.SerializedName

data class MangaDetail(
    @SerializedName("data")
    val data: Manga
)