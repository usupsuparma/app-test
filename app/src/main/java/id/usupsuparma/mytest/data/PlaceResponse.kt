package id.usupsuparma.mytest.data

import com.google.gson.annotations.SerializedName
import id.usupsuparma.mytest.data.model.DataPlace

data class PlaceResponse(

	@field:SerializedName("status_code")
		val statusCode: Int? = null,

	@field:SerializedName("data")
		val dataPlace: DataPlace? = null,

	@field:SerializedName("message")
		val message: String? = null
)




