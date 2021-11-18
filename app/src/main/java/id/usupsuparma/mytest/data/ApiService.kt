package id.usupsuparma.mytest.data

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("place.json")
    fun getPlace(): Call<PlaceResponse>
    @GET("gallery.json")
    fun getGallery(): Call<GalleryResponse>
    @GET("user.json")
    fun getUser(): Call<UserResponse>
}