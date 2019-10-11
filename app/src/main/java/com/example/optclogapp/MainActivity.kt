package com.example.optclogapp

import android.content.Intent
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.LightingColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.view.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    //Firebase Authentication
    val mAuth = FirebaseAuth.getInstance()

    lateinit var btnLogin : Button
    lateinit var txtRegister : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btnLogin)
        txtRegister = findViewById(R.id.textRegister)

        UserRepo.init()

        btnLogin.setOnClickListener{v ->
            Log.d("OPTCLog", "Login Button Pressed")

            // Login Handling
            val emailTxt = findViewById<View>(R.id.textUserEmail) as TextView
            val passwordTxt = findViewById<View>(R.id.textPassword) as TextView

            var email = emailTxt.text.toString()
            var password = passwordTxt.text.toString()

            if(!email.isEmpty() && !password.isEmpty()){
                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, OnCompleteListener{ task ->
                    if (task.isSuccessful){
                        UserRepo.loggedInUser?.uid = mAuth.currentUser!!.uid
                        startActivity(Intent(this, UnitMenuActivity::class.java))
                        Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()
                    }
                    else{
                        Toast.makeText(this, "Login Failed", Toast.LENGTH_LONG).show()
                    }
                })
            }
            else{
                Toast.makeText(this, "Fill in credentials", Toast.LENGTH_LONG).show()
            }

            //startActivity(Intent(this, UnitMenuActivity::class.java))
        }

        txtRegister.setOnClickListener{v ->
            Log.d("OPTCLog", "Register Button Pressed")
            startActivity(Intent(this, Register :: class.java))
        }
    }

    // Firebase login handling
    private fun login(){
        val emailTxt = findViewById<TextView>(R.id.textUserEmail)
        val passwordTxt = findViewById<TextView>(R.id.textPassword)


    }
}
