package com.example.optclogapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    lateinit var btnLogin : Button
    lateinit var imgView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgView = findViewById(R.id.imageView2)
        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener{
            Log.d("OPTCLog", "Login Button Pressed")
            startActivity(Intent(this, UnitMenuActivity::class.java))
        }

        Picasso.get().load("http://onepiece-treasurecruise.com/en/wp-content/uploads/sites/2/f2631.png").into(imgView)

    }
}
