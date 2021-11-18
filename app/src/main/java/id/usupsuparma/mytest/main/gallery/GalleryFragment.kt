package id.usupsuparma.mytest.main.gallery

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import id.usupsuparma.mytest.R

class GalleryFragment : Fragment() {

    companion object {
        private const val TAG = "PlaceFragment"
    }

    private lateinit var mGalleryViewModel: GalleryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mGalleryViewModel =
                ViewModelProvider(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        mGalleryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        mGalleryViewModel.galleries.observe(viewLifecycleOwner, {
            Log.d(TAG, "onCreateView: $it")
        })
        return root
    }
}