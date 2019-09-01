package com.example.optclogapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.unit_recycler.*

class UnitRecycler : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.unit_recycler)

        unitRecycleView.also { recycler ->
            recycler.layoutManager = GridLayoutManager(this, 5, RecyclerView.VERTICAL, false)
            recycler.adapter = UnitAdapter()
        }
    }

}