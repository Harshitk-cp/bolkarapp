package com.harshit.bolkarapp.ui

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel
@Inject constructor(
    private val homeRepository: HomeRepository
): ViewModel(){

    init {
        homeRepository.getPeopleList()
    }
    val list = homeRepository.peopleList

}