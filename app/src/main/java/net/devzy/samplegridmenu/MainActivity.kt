package net.devzy.samplegridmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Prepare Mock up Data
        val dataList = ArrayList<SamData>()

        (0..10).mapTo(dataList) { SamData("Test Course Title " + it, R.drawable.menu_img) }

        //Blinding RecyclerView from XML
        val gridMenuRecyclerView = findViewById<RecyclerView>(R.id.grid_menu_recyclerview)
        gridMenuRecyclerView.setHasFixedSize(true)
        //Adding LayoutManger to RecyclerView
        gridMenuRecyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        //creating our adapter object
        val adapter = MyRecyclerViewGridAdapter(dataList, applicationContext)
        //now adding the adapter to recyclerview
        gridMenuRecyclerView.adapter = adapter

    }
}
