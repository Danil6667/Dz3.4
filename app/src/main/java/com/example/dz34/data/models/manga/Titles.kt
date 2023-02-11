package com.example.dz34.data.models.manga

import com.google.gson.annotations.SerializedName

data class Titles(@SerializedName("en_us")
                  val enUs: String = "",
                  @SerializedName("en_jp")
                  val enJp: String = "")