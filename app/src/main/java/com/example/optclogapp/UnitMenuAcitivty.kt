package com.example.optclogapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlin.math.log

class UnitMenuAcitivty : AppCompatActivity(){
    lateinit var legendImage : ImageView
    lateinit var lrrImage : ImageView
    lateinit var rrImage : ImageView

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit_menu)

        legendImage=findViewById(R.id.legendImage)
        lrrImage=findViewById(R.id.lrrImage)
        rrImage=findViewById(R.id.rrImage)

        legendImage.setOnClickListener{
            Log.d("OPTCLog", "Legend Click Event")
            Toast.makeText(this, "Legend Units", Toast.LENGTH_SHORT).show()
            legendImage.setImageResource(R.drawable.legendposter2)
        }

        lrrImage.setOnClickListener{
            Log.d("OPTCLog", "LRR Click Event")
            Snackbar.make(lrrImage, "LRR Units", Snackbar.LENGTH_SHORT).show()
            lrrImage.setImageResource(R.drawable.goldposter2)
        }

        rrImage.setOnClickListener{
            Log.d("OPTCLog", "RR Click Event")
            rrImage.setImageResource(R.drawable.goldposter2)
        }

        // legendImage.setOnTouchListener { view , motionEvent -> }
        // COME BACK TO THIS AFTER, THIS POSTER WILL FLUTTER ON CLICK AND RELEASE

    }
}