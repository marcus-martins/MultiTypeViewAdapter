package com.example.multitypeviewadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FooterViewHolder(
    inflater: LayoutInflater, parent: ViewGroup
) : RecyclerView.ViewHolder(
    inflater.inflate(R.layout.footer_item, parent, false)
) {
    private var titleTextView: TextView? = null

    init {
        titleTextView = itemView.findViewById(R.id.footerTitle)
    }

    fun bind(footer: ItemView.Footer) {
        titleTextView?.text = footer.title
    }
}