package id.usupsuparma.mytest.data

import android.util.Log
import id.usupsuparma.mytest.data.model.DataPlace
import id.usupsuparma.mytest.data.model.Place
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PlaceRepository() {

    companion object{
        private const val TAG = "PlaceRepository"
        private const val RESTAURANT_ID = "uewq1zg2zlskfw1e867"
    }

    fun getPlaces() {
        val client = ApiConfig.getApiService().getPlace()
    }
}