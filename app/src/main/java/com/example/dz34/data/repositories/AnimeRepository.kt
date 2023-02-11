package com.example.dz34.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.dz34.base.BaseRepository
import com.example.dz34.data.remote.apiservices.AnimeApiService
import com.example.dz34.data.remote.pagingsources.AnimePagingSource
import javax.inject.Inject

class AnimeRepository @Inject constructor(private val animeApiService: AnimeApiService): BaseRepository() {

    fun getAnime() = Pager(
    PagingConfig(pageSize = 20, initialLoadSize = 10)
    ) {
        AnimePagingSource(animeApiService)
    }.liveData

    fun getDetailAnime(id : Int) = doRequest {
       animeApiService.getDetailAnime(id = id)
    }
}