package com.amercosovic.moodapp.model

import androidx.annotation.Nullable
import com.google.gson.annotations.SerializedName

data class Mood (

    @SerializedName("comment")
    var moodcomment: String = "",

    @SerializedName("score")
    var moodscore: Int = 3,

    @SerializedName("date")
    var mooddate: Long = System.currentTimeMillis()
)