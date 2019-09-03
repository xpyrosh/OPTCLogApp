package com.example.optclogapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
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

        val builder = AlertDialog.Builder(this)
        val dialogView = layoutInflater.inflate(R.layout.art_popup, null)
        val imgArt = dialogView.findViewById<ImageView>(R.id.imgArt)
        Picasso.get().load("https://vignette.wikia.nocookie.net/onepiecetreasurecruiseglobal/images/6/6e/C2446.png/").into(imgArt)
        builder.setView(dialogView)

        Picasso.get().load("https://www.barnesandnoble.com/blog/sci-fi-fantasy/wp-content/uploads/sites/4/2017/07/onepiece2.jpg").into(imgView)

        imgView.setOnClickListener{
            builder.show()
        }
        

    }
}
