package id.usupsuparma.mytest.main.place

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.usupsuparma.mytest.R
import id.usupsuparma.mytest.data.model.Place
import id.usupsuparma.mytest.databinding.FragmentPlaceBinding

class PlaceFragment : Fragment() {

    companion object {
        private const val TAG = "PlaceFragment"
    }

    private lateinit var mPlaceViewModel: PlaceViewModel
    private var mPlaces: ArrayList<Place> = arrayListOf()
    private lateinit var rvPlace: RecyclerView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mPlaceViewModel =
                ViewModelProvider(this).get(PlaceViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_place, container, false)
        rvPlace = root.findViewById(R.id.rv_place);


        mPlaceViewModel.places.observe(viewLifecycleOwner, Observer {
            Log.d(TAG, "onCreateView: $it")
            mPlaces.addAll(it)
            setData(it)
        })


        showRecyclerList()
        return root
    }



    private fun showRecyclerList() {
        rvPlace.layoutManager = LinearLayoutManager(activity)
        val listPlaceAdapter = PlaceAdapter(mPlaces)
        rvPlace.adapter = listPlaceAdapter
    }

    private fun setData(places: List<Place>) {
        val listPlaceAdapter = PlaceAdapter(places)
        rvPlace.adapter = listPlaceAdapter

    }
}