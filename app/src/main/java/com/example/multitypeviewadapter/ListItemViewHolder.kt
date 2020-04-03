package com.example.multitypeviewadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListItemViewHolder(
    inflater: LayoutInflater, parent: ViewGroup
) : RecyclerView.ViewHolder(
    inflater.inflate(R.layout.list_item, parent, false)
) {
    private var nameTextView: TextView? = null
    private var descriptionTextView: TextView? = null

    init {
        nameTextView = itemView.findViewById(R.id.listItemName)
        descriptionTextView = itemView.findViewById(R.id.listItemDescription)
    }

    fun bind(listItem: ItemView.ListItem) {
        nameTextView?.text = listItem.name
        descriptionTextView?.text = listItem.description
    }
}