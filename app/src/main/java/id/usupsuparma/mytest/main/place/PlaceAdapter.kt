package id.usupsuparma.mytest.main.place

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.usupsuparma.mytest.R
import id.usupsuparma.mytest.data.model.Place

class PlaceAdapter(private  val listPlace : List<Place>): RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_place, viewGroup, false))
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.title.text = listPlace[position].title
        viewHolder.desc.text = listPlace[position].content
        Glide.with(viewHolder.itemView.context)
            .load(listPlace[position].image)
            .apply(RequestOptions().override(55, 55))
            .into(viewHolder.image)
    }
    override fun getItemCount() = listPlace.size
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.txt_title)
        val image: ImageView = view.findViewById(R.id.img_place)
        val desc: TextView = view.findViewById(R.id.txt_content)
    }
}