package com.example.customlistview

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val name = arrayOf<String>("Large pizza","Extra large pizza","Midium pizza","Small pizza","Small pizza","Small pizza")
    val descTxt=arrayListOf<String>("nice pizza","very big pizza","very good test","yummy","testy","good")
    val image = arrayOf<Int>(R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza)
    private lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)

        val listAdapter = ListAdapter(this, name,descTxt,image)
        listView.adapter = listAdapter
    }
}