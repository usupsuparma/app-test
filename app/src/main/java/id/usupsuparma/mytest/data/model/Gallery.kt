package id.usupsuparma.mytest.data.model

import com.google.gson.annotations.SerializedName

data class Gallery(

    @field:SerializedName("image")
    val image: String? = null,

    @field:SerializedName("thumbnail")
    val thumbnail: String? = null,

    @field:SerializedName("caption")
    val caption: String? = null
)