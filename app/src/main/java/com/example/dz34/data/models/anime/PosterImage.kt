package com.example.dz34.data.models.anime

import com.google.gson.annotations.SerializedName

data class PosterImage(
    @SerializedName("small")
    val small: String = "",
    @SerializedName("original")
    val original: String = "",
    @SerializedName("large")
    val large: String = "",
    @SerializedName("tiny")
    val tiny: String = "",
    @SerializedName("medium")
    val medium: String = ""
)