package com.example.dz34.data.models.manga

import com.example.dz34.data.models.manga.Attributes
import com.google.gson.annotations.SerializedName

data class Manga(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("id")
    val id: String = "",
    @SerializedName("type")
    val type: String = ""
)