package com.harshit.bolkarapp.ui

import androidx.lifecycle.ViewModel
import com.harshit.bolkarapp.pojo.response.RequestGetMembers
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel
@Inject constructor(
    homeRepository: HomeRepository
): ViewModel(){

    init {
        homeRepository.getMembers()
    }

//    val list = homeRepository.peopleList
    val members = homeRepository.members



}