package id.usupsuparma.mytest.main.place

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.usupsuparma.mytest.data.ApiConfig
import id.usupsuparma.mytest.data.PlaceResponse
import id.usupsuparma.mytest.data.model.Place
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PlaceViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Place Fragment"
    }
    val text: LiveData<String> = _text

    private val _place = MutableLiveData<List<Place>>()
    val places: LiveData<List<Place>> = _place

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    companion object{
        private const val TAG = "PlaceViewModel"
    }


    init {
        getPlaces()
    }

    private fun getPlaces() {
        _isLoading.value = true
        val client = ApiConfig.getApiService().getPlace()
        client.enqueue(object : Callback<PlaceResponse> {
            override fun onResponse(
                call: Call<PlaceResponse>,
                response: Response<PlaceResponse>
            ) {
                _isLoading.value = false
                if (response.isSuccessful) {
                    _place.value = response.body()?.dataPlace?.content!!
//                    _listReview.value = response.body()?.restaurant?.customerReviews
                } else {
                    Log.e(TAG, "onFailure: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<PlaceResponse>, t: Throwable) {
                _isLoading.value = false
                Log.e(TAG, "onFailure: ${t.message.toString()}")
            }
        })
    }

}