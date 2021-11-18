package id.usupsuparma.mytest.data.model

import com.google.gson.annotations.SerializedName

data class Header(

        @field:SerializedName("subtitle")
        val subtitle: String? = null,

        @field:SerializedName("title")
        val title: String? = null
)