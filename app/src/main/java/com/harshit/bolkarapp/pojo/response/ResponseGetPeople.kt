package com.harshit.bolkarapp.pojo.response

import com.google.gson.annotations.SerializedName
import com.harshit.bolkarapp.pojo.entities.Data

data class ResponseGetPeople(
    @SerializedName("data")
    var data: List<Data> = listOf(),
    @SerializedName("code")
    var code: Int = 0
)