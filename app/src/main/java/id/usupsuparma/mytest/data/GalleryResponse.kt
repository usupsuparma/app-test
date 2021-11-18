package id.usupsuparma.mytest.data

import com.google.gson.annotations.SerializedName
import id.usupsuparma.mytest.data.model.Gallery

data class GalleryResponse(

	@field:SerializedName("status_code")
	val statusCode: Int? = null,

	@field:SerializedName("data")
	val data: List<Gallery>? = null,

	@field:SerializedName("message")
	val message: String? = null
)


