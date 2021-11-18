package id.usupsuparma.mytest.main.gallery

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.usupsuparma.mytest.data.ApiConfig
import id.usupsuparma.mytest.data.GalleryResponse
import id.usupsuparma.mytest.data.model.Gallery
import id.usupsuparma.mytest.data.model.Place
import id.usupsuparma.mytest.main.place.PlaceViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text

    private val _gallery = MutableLiveData<List<Gallery>>()
    val galleries: LiveData<List<Gallery>> = _gallery

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    companion object{
        private const val TAG = "PlaceViewModel"
    }

    init {
        getGalleries()
    }

    private fun getGalleries() {
        _isLoading.value = true
        val client = ApiConfig.getApiService().getGallery()
        client.enqueue(object : Callback<GalleryResponse> {
            override fun onResponse(
                call: Call<GalleryResponse>,
                response: Response<GalleryResponse>
            ) {
                _isLoading.value = false
                if (response.isSuccessful) {
                    _gallery.value = response.body()?.data!!
                } else {
                    Log.e(TAG, "onFailure: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<GalleryResponse>, t: Throwable) {
                _isLoading.value = false
                Log.e(TAG, "onFailure: ${t.message.toString()}")
            }
        })
    }
}