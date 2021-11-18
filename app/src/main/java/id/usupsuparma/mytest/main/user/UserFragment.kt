package id.usupsuparma.mytest.main.user

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

class UserFragment : Fragment() {

    companion object {
        private const val TAG = "PlaceFragment"
    }

    private lateinit var mUserViewModel: UserViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mUserViewModel =
                ViewModelProvider(this).get(UserViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_user, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        mUserViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        mUserViewModel.user.observe(viewLifecycleOwner, Observer {
            Log.d(TAG, "onCreateView: $it")
        })
        return root
    }
}