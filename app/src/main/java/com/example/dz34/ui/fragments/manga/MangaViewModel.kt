package com.example.dz34.ui.fragments.manga

import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.dz34.base.BaseViewModel
import com.example.dz34.data.repositories.MangaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(private val repository: MangaRepository) : BaseViewModel() {

    fun getManga() = repository.getManga().cachedIn(viewModelScope)
}