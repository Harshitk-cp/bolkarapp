package com.harshit.bolkarapp.pojo.entities

data class Data(
    val __v: List<Members> ,
    val _id: String ="",
    val appId: String ="",
    val blocks: String ="",
    val host: List<Host>,
    val modHistory: String ="",
    val moderators: List<Moderators>,
    val raiseAllow: Boolean = true,
    val requests: String ="",
    val roomid: String ="",
    val speakers: List<Speakers>,
    val start_time: String ="",
    val token: String ="",
    val topic: String ="",
    val total_members: Int =0,
    val type: Int =0,
    val version: Int =0,
    val volume: Int =0,
    val members: List<Members>

)