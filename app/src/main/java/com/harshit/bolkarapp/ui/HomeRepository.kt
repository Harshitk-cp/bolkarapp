package com.harshit.bolkarapp.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.harshit.bolkarapp.network.Services
import com.harshit.bolkarapp.pojo.entities.Data
import com.harshit.bolkarapp.pojo.entities.Members
import com.harshit.bolkarapp.pojo.entities.PeopleWrapper
import com.harshit.bolkarapp.pojo.response.RequestGetMembers
import com.harshit.bolkarapp.pojo.response.ResponseGetPeople
import com.harshit.bolkarapp.utils.Constants
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class HomeRepository
@Inject constructor(
    private val webServices: Services,
    private val constants: Constants
) {

    private val _members = MutableLiveData<List<Members>>()
    val members: LiveData<List<Members>>
        get() = _members

    fun getMembers() {
        webServices.getMembers()
            .observeOn(Schedulers.io())
            .subscribeOn(AndroidSchedulers.mainThread())
            .subscribe({

                val list = mutableListOf<Members>()
                for (i in it.members) {
                    list.add(i)
                }
                _members.postValue(list)

            }, {
            })
    }
}

//private val _peopleList = MutableLiveData<List<PeopleWrapper>>()
//val peopleList: LiveData<List<PeopleWrapper>>
//    get() = _peopleList
//
//fun getPeopleList() {
//    webServices.getPeople()
//        .subscribeOn(Schedulers.io())
//        .observeOn(AndroidSchedulers.mainThread())
//        .subscribe({
//            _peopleList.postValue(createList(it))
//        },
//            {
//                Log.e("HOMEREPO", "ERROR", it)
//            })
//}
//}
//
//private fun createList(
//    people: ResponseGetPeople
//): List<PeopleWrapper> {
//    val ans = mutableListOf<PeopleWrapper>()
//
//    ans.add(PeopleWrapper(people.data))
//
//    return ans
//}



