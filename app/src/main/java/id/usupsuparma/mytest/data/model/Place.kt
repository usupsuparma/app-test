package id.usupsuparma.mytest.data.model

import com.google.gson.annotations.SerializedName


data class Place(

        @field:SerializedName("image")
        val image: String? = null,

        @field:SerializedName("id")
        val id: Int? = null,

        @field:SerializedName("media")
        val media: List<Any?>? = null,

        @field:SerializedName("title")
        val title: String? = null,

        @field:SerializedName("type")
        val type: String? = null,

        @field:SerializedName("content")
        val content: String? = null
)