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
import id.usupsuparma.mytest.R
import id.usupsuparma.mytest.data.model.Place
import id.usupsuparma.mytest.databinding.FragmentPlaceBinding

class PlaceFragment : Fragment() {

    companion object {
        private const val TAG = "PlaceFragment"
    }

    private lateinit var mPlaceViewModel: PlaceViewModel
    private lateinit var binding: FragmentPlaceBinding
    private var mPlaces: ArrayList<Place> = arrayListOf()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mPlaceViewModel =
                ViewModelProvider(this).get(PlaceViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_place, container, false)
        binding = FragmentPlaceBinding.bind(root)

        mPlaceViewModel.places.observe(viewLifecycleOwner, Observer {
            mPlaces.addAll(it)
        })
        showRecyclerList()
        return root
    }



    private fun showRecyclerList() {
        binding.rvPlace.layoutManager = LinearLayoutManager(activity)
        val listHeroAdapter = PlaceAdapter(mPlaces)
        binding.rvPlace.adapter = listHeroAdapter
    }
}