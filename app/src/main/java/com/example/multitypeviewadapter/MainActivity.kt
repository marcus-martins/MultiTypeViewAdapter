package com.example.multitypeviewadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MultiTypeViewAdapter(mockListItems())
        }
    }

    private fun mockListItems() : List<ItemView> {
        return listOf(
            ItemView.Header("Header Teste"),
            ItemView.ListItem("Item 1", "O item 1 faz alguma coisa"),
            ItemView.ListItem("Item 2", "O item 2 faz alguma coisa"),
            ItemView.Footer("Footer Teste")
        )
    }
}
