package com.example.myapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val language = arrayOf<String>(
        "HTML",
        "CSS",
        "PHP",
        "Android",
        "Kotlin",
        "HTML",
        "CSS"
    )
    val description = arrayOf<String>(
        "HTML Language",
        "CSS Language",
        "PHP Language",
        "Android Language",
        "Kotlin Language",
        "Android Language",
        "Kotlin Language"
    )

    val imageId = arrayOf<Int>(
        R.drawable.carts, R.drawable.online, R.drawable.carts,
        R.drawable.online, R.drawable.carts, R.drawable.online, R.drawable.carts
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListAdapter = MyListAdapter(this, language, description, imageId)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(
                this,
                "Click on item at $itemAtPos its item id $itemIdAtPos",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}