package id.usupsuparma.mytest.data

import com.google.gson.annotations.SerializedName
import id.usupsuparma.mytest.data.model.User

data class UserResponse(

	@field:SerializedName("status_code")
	val statusCode: Int? = null,

	@field:SerializedName("data")
	val data: User? = null,

	@field:SerializedName("message")
	val message: String? = null
)


