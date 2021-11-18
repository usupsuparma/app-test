package id.usupsuparma.mytest.data.model

import com.google.gson.annotations.SerializedName

data class DataPlace(

        @field:SerializedName("header")
        val header: Header? = null,

        @field:SerializedName("content")
        val content: List<Place>? = null
)