package com.example.multitypeviewadapter

sealed class ItemView {
    data class Header(val title: String) : ItemView()
    data class ListItem(val name: String, val description: String) : ItemView()
    data class Footer(val title: String) : ItemView()
}