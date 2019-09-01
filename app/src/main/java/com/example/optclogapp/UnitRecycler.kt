package com.example.optclogapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.unit_recycler.*

class UnitRecycler : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.unit_recycler)

        unitRecycleView.apply {
            layoutManager = GridLayoutManager(this@UnitRecycler, 3,RecyclerView.VERTICAL, false)
            adapter = RecyclerAdapter()
        }
    }
}