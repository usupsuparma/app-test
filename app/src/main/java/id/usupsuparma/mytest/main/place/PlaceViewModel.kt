package id.usupsuparma.mytest.main.place

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlaceViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Place Fragment"
    }
    val text: LiveData<String> = _text


}