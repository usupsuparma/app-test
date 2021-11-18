package id.usupsuparma.mytest.main.place

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import id.usupsuparma.mytest.R

class PlaceFragment : Fragment() {

    private lateinit var mPlaceViewModel: PlaceViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mPlaceViewModel =
                ViewModelProvider(this).get(PlaceViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_place, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        mPlaceViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}