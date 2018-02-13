package net.devzy.samplegridmenu

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by ted555 on 2/13/18.
 */

class MyRecyclerViewGridAdapter(private var dataList: List<SamData>, private var context: Context) : RecyclerView.Adapter<MyRecyclerViewGridAdapter.ViewHolder>() {

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        holder?.bindItems(dataList[position])
        holder?.itemView?.setOnClickListener {

        }
    }

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.grid_item_layout, parent, false)

        return ViewHolder(view, context)
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return dataList.size
    }
    //Class is holding the items view
    class ViewHolder(itemView: View, context: Context) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(data: SamData) {
            var titleTextView = itemView.findViewById(R.id.item_title) as TextView
            var itemIcon = itemView.findViewById(R.id.item_icon) as ImageView

            titleTextView.text = data.title
            itemIcon.setImageResource(data.imgRes)
        }
    }
}