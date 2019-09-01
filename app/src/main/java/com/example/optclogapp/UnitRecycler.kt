package com.example.optclogapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.unit_recycler.*

class UnitRecycler : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val legends = listOf("0261", "0367", "0416", "0459", "0530", "0562", "0578", "0649", "0669",
            "0718", "0720", "0748", "0870", "0935", "1001", "1035", "1045", "1085", "1121", "1123",
            "1192", "1240", "1268", "1314", "1362", "1391", "1404", "1434", "1473", "1532", "1571",
            "1588", "1610", "1652", "1698", "1747", "1751", "1763", "1794", "1832", "1869", "1883",
            "1910", "1935", "1951", "1985", "2007", "2023", "2025", "2074", "2076", "2099", "2113",
            "2148", "2181", "2201", "2234", "2236", "2251", "2265", "2302", "2330", "2338", "2365",
            "2418", "2433", "2441", "2446", "2465", "2475", "2477", "2577", "3334", "3346")

        setContentView(R.layout.unit_recycler)

        unitRecycleView.also { recycler ->
            recycler.layoutManager = GridLayoutManager(this, 4, RecyclerView.VERTICAL, false)
            recycler.adapter = UnitAdapter(legends)
        }
    }

}