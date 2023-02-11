package com.example.dz34.data.remote.apiservices

import com.example.dz34.data.models.manga.Manga
import com.example.dz34.data.models.manga.MangaResponce
import com.example.dz34.data.models.manga.detail.MangaDetail
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MangaApiService {

    @GET("manga")
    suspend fun getManga(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int
    ): MangaResponce<Manga>

    @GET("manga/{id}")
    suspend fun getDetailManga(
        @Path("id") id: Int
    ): MangaDetail
}