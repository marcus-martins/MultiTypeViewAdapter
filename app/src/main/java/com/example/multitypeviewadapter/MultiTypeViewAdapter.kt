package com.example.multitypeviewadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MultiTypeViewAdapter(
    private val itemViewList : List<ItemView>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val HEADER = 1
    private val LIST_ITEM = 2
    private val FOOTER = 3

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            HEADER -> HeaderViewHolder(inflater, parent)
            LIST_ITEM -> ListItemViewHolder(inflater, parent)
            FOOTER -> FooterViewHolder(inflater, parent)
            else -> throw Exception("Not found view holder")
        }
    }

    override fun getItemCount() = itemViewList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemViewList[position]
        when (itemViewList[position]) {
            is ItemView.Header -> (holder as HeaderViewHolder).bind(item as ItemView.Header)
            is ItemView.ListItem -> (holder as ListItemViewHolder).bind(item as ItemView.ListItem)
            is ItemView.Footer -> (holder as FooterViewHolder).bind(item as ItemView.Footer)
        }
    }

    override fun getItemViewType(position: Int) =
        when (itemViewList[position]) {
            is ItemView.Header -> HEADER
            is ItemView.ListItem -> LIST_ITEM
            is ItemView.Footer -> FOOTER
        }
}