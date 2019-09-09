package com.example.optclogapp

import android.content.Intent
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.LightingColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    lateinit var btnLogin : Button
    lateinit var imgView2: ImageView
    lateinit var imgView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgView = findViewById(R.id.imageView2)
        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener{
            Log.d("OPTCLog", "Login Button Pressed")

            UserRepo.init()

            startActivity(Intent(this, UnitMenuActivity::class.java))
        }

        //Another failed attempt at grayscale courtesy of:
        //https://medium.com/over-engineering/manipulating-images-and-drawables-with-androids-colorfilter-25bf061843e7


        //val fragManager = supportFragmentManager
        //val artFrag = ArtFragment()

        Picasso.get().load("https://www.barnesandnoble.com/blog/sci-fi-fantasy/wp-content/uploads/sites/4/2017/07/onepiece2.jpg").into(imgView)

        imgView.setOnClickListener{
            //artFrag.show(fragManager, "Art Frag")

        }



    }
}
