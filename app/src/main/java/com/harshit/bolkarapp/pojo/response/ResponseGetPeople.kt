package com.harshit.bolkarapp.pojo.response

import com.google.gson.annotations.SerializedName
import com.harshit.bolkarapp.pojo.entities.Data
import com.harshit.bolkarapp.pojo.entities.Members

data class ResponseGetPeople(
    @SerializedName("data")
    var data: List<Data> = listOf(),
    @SerializedName("code")
    var code: Int = 0
)

data class RequestGetMembers(
    var members: List<Data>  = listOf()
)