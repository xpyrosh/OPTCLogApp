package com.example.optclogapp

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class UnitMenuAcitivty : AppCompatActivity(){
    lateinit var legendImage : ImageView
    lateinit var lrrImage : ImageView
    lateinit var rrImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit_menu)

        legendImage=findViewById(R.id.legendImage)
        lrrImage=findViewById(R.id.lrrImage)
        rrImage=findViewById(R.id.rrImage)

        legendImage.setOnClickListener{
            Toast.makeText(this, "Legend Units", Toast.LENGTH_SHORT).show()
            legendImage.setImageResource(R.drawable.goldposter)
        }

        legendImage.setOnHoverListener{ view: View, motionEvent: MotionEvent ->
            legendImage.setImageResource(R.drawable.goldposter)
            true
        }

    }
}