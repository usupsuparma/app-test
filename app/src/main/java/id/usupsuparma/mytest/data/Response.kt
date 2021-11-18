package id.usupsuparma.mytest.data

import com.google.gson.annotations.SerializedName
import id.usupsuparma.mytest.data.model.Data

data class Response(

		@field:SerializedName("status_code")
		val statusCode: Int? = null,

		@field:SerializedName("data")
		val data: Data? = null,

		@field:SerializedName("message")
		val message: String? = null
)




