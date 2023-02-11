package com.example.dz34.ui.fragments.manga.detail

import com.example.dz34.base.BaseViewModel
import com.example.dz34.data.repositories.MangaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaDetailViewModel  @Inject constructor(private val repository: MangaRepository) : BaseViewModel() {

    fun getDetailManga(id: Int) = repository.getDetailManga(id = id)
}