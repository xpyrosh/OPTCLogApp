package com.example.optclogapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.unit_recycler.*

data class Units (var unitId: String, var thumbnailIcon: String, var artWork: String)

class UnitRecycler : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //super tedious process for dummy data
        val legends = listOf<Units>(
            Units("0261", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/5/55/F0261.png",
            "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/c5/C0261.png"),
            Units("0367", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/d/d5/F0367.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/a/aa/C0367.png"),
            Units("0416", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/f/f2/F0416.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/9/9a/C0416.png"),
            Units("0459", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/3/33/F0459.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/3/3a/C0459.png"),
            Units("0530", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/3/3a/F0530.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/a/a1/C0530.png"),
            Units("0562", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/c6/F0562.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/a/a6/C0562.png"),
            Units("0578", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/4/4e/F0578.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/c8/C0578.png"),
            Units("0649", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/9/98/F0649.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/d/db/C0649.png"),
            Units("0669", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/2/25/F0669.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/8/8b/C0669.png"),
            Units("0718", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/2/2e/F0718.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/0/06/C0718.png"),
            Units("0720", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/0/01/F0720.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/9/94/C0720.png"),
            Units("0748", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/3/33/F0748.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/7/78/C0748.png"),
            Units("0870", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/f/ff/F0870.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/8/8e/C0870.png"),
            Units("0935", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/1/11/F0935.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/7/74/C0935.png"),
            Units("1001", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/9/9d/F1001.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/9/9a/C1001.png"),
            Units("1035", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/2/26/F1035.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/0/0b/C1035.png"),
            Units("1045", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/9/90/F1045.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/9/9f/C1045.png"),
            Units("1085", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/6/63/F1085.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/3/31/C1085.png"),
            Units("1121", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/1/1b/F1121.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/f/f7/C1121.png"),
            Units("1123", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/5/58/F1123.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/1/18/C1123.png"),
            Units("1192", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/6/63/F1192.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/b/b7/C1192.png"),
            Units("1240", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/0/0b/F1240.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/c2/C1240.png"),
            Units("1268", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/7/78/F1268.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/9/9e/C1268.png"),
            Units("1314", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/a/af/F1314.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/0/06/C1314.png"),
            Units("1362", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/2/21/F1362.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/6/64/C1362.png"),
            Units("1391", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/5/5d/F1391.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/9/99/C1391.png"),
            Units("1404", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/8/8b/F1404.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/6/62/C1404.png"),
            Units("1434", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/5/59/F1434.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/3/36/C1434.png"),
            Units("1473", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/6/6c/F1473.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/c3/C1473.png"),
            Units("1532", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/7/79/F1532.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/7/72/C1532.png"),
            Units("1571", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/1/1c/F1571.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/c2/C1571.png")
        )

        /*  "1588", "1610", "1652", "1698", "1747", "1751", "1763", "1794", "1832", "1869", "1883",
            "1910", "1935", "1951", "1985", "2007", "2023", "2025", "2074", "2076", "2099", "2113",
            "2148", "2181", "2201", "2234", "2236", "2251", "2265", "2302", "2330", "2338", "2365",
            "2418", "2433", "2441", "2446", "2465", "2475", "2477", "2577", "3334", "3346")*/


        setContentView(R.layout.unit_recycler)

        unitRecycleView.also { recycler ->
            recycler.layoutManager = GridLayoutManager(this, 4, RecyclerView.VERTICAL, false)
            recycler.adapter = UnitAdapter(legends)
        }
    }

}