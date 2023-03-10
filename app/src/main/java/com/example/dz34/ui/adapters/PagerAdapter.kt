package com.example.dz34.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.dz34.ui.fragments.anime.AnimeFragment
import com.example.dz34.ui.fragments.manga.MangaFragment

class PagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> AnimeFragment()
            1 -> MangaFragment()
            else -> AnimeFragment()
        }
    }
}