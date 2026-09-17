package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        //A recyclerview needs both a layout manager & an adaptor.
        recyclerView.layoutManager = GridLayoutManager(this, 4)

        //TODO Step 4: Provide a RecyclerView.Adapter
        //Need a constructor for an array.
        recyclerView.adapter = NumberDisplayAdapter(
            numbers = IntArray(size = 20) { (it+1) * 5}
        )


    }
}