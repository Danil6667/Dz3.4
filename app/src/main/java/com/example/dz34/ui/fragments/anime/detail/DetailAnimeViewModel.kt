package com.example.dz34.ui.fragments.anime.detail

import com.example.dz34.base.BaseViewModel
import com.example.dz34.data.repositories.AnimeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailAnimeViewModel  @Inject constructor(private val repository: AnimeRepository) : BaseViewModel() {

    fun getDetailAnime(id: Int) = repository.getDetailAnime(id = id)
}