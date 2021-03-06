package com.mralonso.trainingapp.view.adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.mralonso.trainingapp.R
import com.mralonso.trainingapp.model.Item
import com.mralonso.trainingapp.utils.inflate
import com.mralonso.trainingapp.utils.loadUrl
import kotlinx.android.synthetic.main.view_item.view.*

/**
 * Created by miguel.rodriguez on 7/4/17.
 */

class ItemAdapter(val items: MutableList<Item> = mutableListOf<Item>(), val listener: (Item) -> Unit) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.view_item))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = with(holder.itemView){
        val item = items[position]
        item_title.text = item.title;
        item_image.loadUrl(item.url)
        setOnClickListener { listener(item) }
    }

    fun addItems(newItems: List<Item>) {
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun getItemCount() = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}