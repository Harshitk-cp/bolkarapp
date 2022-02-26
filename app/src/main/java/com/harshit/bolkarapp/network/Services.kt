package com.harshit.bolkarapp.network

import com.harshit.bolkarapp.pojo.entities.Data
import com.harshit.bolkarapp.pojo.entities.Members
import com.harshit.bolkarapp.pojo.entities.PeopleWrapper
import com.harshit.bolkarapp.pojo.response.RequestGetMembers
import com.harshit.bolkarapp.pojo.response.ResponseGetPeople
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Query

interface Services {

    @GET("live/room.json")
    fun getPeople(
    ): Single<ResponseGetPeople>

    @GET("live/room.json")
    fun getMembers(
    ): Observable<Data>

}