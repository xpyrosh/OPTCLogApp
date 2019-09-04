package com.example.optclogapp

import android.os.Bundle
import android.widget.TextView
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
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/c2/C1571.png"),
            Units("1588", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/4/40/F1588.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/6/69/C1588.png"),
            Units("1610", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/7/76/F1610.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/c9/C1610.png"),
            Units("1652", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/3/3a/F1652.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/8/81/C1652.png"),
            Units("1698", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/cb/F1698.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/4/4a/C1698.png"),
            Units("1747", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/8/88/F1747.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/e/e1/C1747.png"),
            Units("1751", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/c4/F1751.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/f/fe/C1751.png"),
            Units("1763", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/3/33/F1763.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/b/b9/C1763.png"),
            Units("1794", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/c1/F1794.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/5/51/C1794.png"),
            Units("1832", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/d/d7/F1832.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/6/6a/C1832.png"),
            Units("1869", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/0/0a/F1869.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/3/35/C1869.png"),
            Units("1883", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/2/2b/F1883.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/2/2d/C1883.png"),
            Units("1910", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/1/19/F1910.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/a/a1/C1910.png"),
            Units("1935", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/d/dd/F1935.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/5/58/C1935.png"),
            Units("1951", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/3/36/F1951.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/2/26/C1951.png"),
            Units("1985", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/7/78/F1985.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/4/43/C1985.png"),
            Units("2007", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/1/12/F2007.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/d/d5/C2007.png"),
            Units("2023", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/4/48/F2023.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/4/47/C2023.png"),
            Units("2025", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/8/8f/F2025.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/8/80/C2025.png"),
            Units("2074", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/7/7b/F2074.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/7/7a/C2074.png"),
            Units("2076", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/3/3e/F2076.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/9/99/C2076.png"),
            Units("2099", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/cb/F2099.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/4/43/C2099.png"),
            Units("2113", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/8/84/F2113.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/cc/C2113.png"),
            Units("2148", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/5/5b/F2148.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/2/2d/C2148.png"),
            Units("2181", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/0/0c/F2181.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/0/02/C2181.png"),
            Units("2201", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/d/de/F2201.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/0/03/C2201.png"),
            Units("2234", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/2/26/F2234.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/f/ff/C2234.png"),
            Units("2236", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/5/50/F2236.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/e/e4/C2236.png"),
            Units("2251", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/9/90/F2251.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/8/89/C2251.png"),
            Units("2265", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/c8/F2265.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/2/27/C2265.png"),
            Units("2302", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/8/82/F2302.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/7/75/C2302.png"),
            Units("2330", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/8/8d/F2330.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/4/40/C2330.png"),
            Units("2338", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/4/4e/F2338.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/c/c6/C2338.png"),
            Units("2365", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/3/31/F2365.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/6/68/C2365.png"),
            Units("2433", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/0/0d/F2433.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/9/9c/C2433.png"),
            Units("2441", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/b/b9/F5022.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/0/0d/C5022.png"),
            Units("2446", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/5/54/F2446.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/6/6e/C2446.png"),
            Units("2465", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/3/30/F2465.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/b/b8/C2465.png"),
            Units("2577", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/f/f5/F2577.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/6/6b/C2577.png"),
            Units("3334", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/6/62/F5014.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/b/b7/C5014.png"),
            Units("3346", "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/f/f1/F5026.png",
                "https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/8/86/C5026.png")
        )

        val currentUser = listOf<String>("999 888 777", "500", "40/70")

        setContentView(R.layout.unit_recycler)

        unitRecycleView.also { recycler ->
            recycler.layoutManager = GridLayoutManager(this, 4, RecyclerView.VERTICAL, false)
            recycler.adapter = UnitAdapter(legends)
        }
    }

    override fun onResume() {
        super.onResume()
    }

}