package com.example.dz34.data.models.manga

import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("next")
    val next: String?,
    @SerializedName("last")
    val last: String = "",
    @SerializedName("first")
    val first: String = ""
)