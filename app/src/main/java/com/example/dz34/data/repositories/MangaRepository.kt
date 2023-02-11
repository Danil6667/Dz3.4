package com.example.dz34.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.dz34.base.BaseRepository
import com.example.dz34.data.remote.apiservices.MangaApiService
import com.example.dz34.data.remote.pagingsources.MangaPagingSource
import javax.inject.Inject

class MangaRepository @Inject constructor(private val mangaApiService: MangaApiService): BaseRepository() {

    fun getManga() = Pager(
    PagingConfig(pageSize = 20, initialLoadSize = 10)
    ) {
        MangaPagingSource(mangaApiService)
    }.liveData

    fun getDetailManga(id : Int) = doRequest {
       mangaApiService.getDetailManga(id = id)
    }
}