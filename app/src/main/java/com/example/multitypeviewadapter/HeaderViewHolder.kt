package com.example.multitypeviewadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HeaderViewHolder(
    inflater: LayoutInflater, parent: ViewGroup
) : RecyclerView.ViewHolder(
    inflater.inflate(R.layout.header_item, parent, false)
) {
    private var titleTextView: TextView? = null

    init {
        titleTextView = itemView.findViewById(R.id.headerTitle)
    }

    fun bind(header: ItemView.Header) {
        titleTextView?.text = header.title
    }
}