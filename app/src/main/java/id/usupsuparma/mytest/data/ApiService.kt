package id.usupsuparma.mytest.data

import id.usupsuparma.mytest.data.model.Data
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("place.json")
    fun getPlace(): Call<Data>
}