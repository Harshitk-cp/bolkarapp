package com.harshit.bolkarapp.network

import com.harshit.bolkarapp.pojo.response.ResponseGetPeople
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface Services {

    @GET("live/room.json")
    fun getPeople(
    ): Single<ResponseGetPeople>

}