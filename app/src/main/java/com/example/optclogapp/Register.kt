package com.example.optclogapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.unit_recycler.view.*

class Register : AppCompatActivity() {

    val mAuth = FirebaseAuth.getInstance()
    lateinit var btnRegister : Button
    lateinit var mDatabase : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        btnRegister = findViewById(R.id.btnRegister)

        mDatabase = FirebaseDatabase.getInstance().getReference("users")

        btnRegister.setOnClickListener{v->

            val emailTxt = findViewById<View>(R.id.textUserEmail) as TextView
            val passwordTxt = findViewById<View>(R.id.textPassword) as TextView
            val pidTxt = findViewById<View>(R.id.textPID) as TextView
            val plvlTxt = findViewById<View>(R.id.textPLVL) as TextView

            var email = emailTxt.text.toString()
            var password = passwordTxt.text.toString()
            var PID = pidTxt.text.toString()
            var PLVL = plvlTxt.text.toString()

            if(!email.isEmpty() && !password.isEmpty() && !PID.isEmpty() && !PLVL.isEmpty()){
                mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, OnCompleteListener {task ->
                    if(task.isSuccessful){
                        val user = mAuth.currentUser
                        val uid = user!!.uid
                        //mDatabase.child(uid).child("PID").setValue(PID)
                        mDatabase.push().setValue(UserRepo.Users(uid, PLVL, PID))
                        Toast.makeText(this, "Successfully Signed Up", Toast.LENGTH_LONG).show()
                        startActivity(Intent(this, UnitMenuActivity::class.java))
                    }
                    else{
                        Log.d("FBFAIL", "FIREBASE FAILED TO CREATE")
                        Toast.makeText(this, "Failed to create", Toast.LENGTH_LONG).show()
                    }
                })
            }
            else {
                Toast.makeText(this, "Please fill in all credentials", Toast.LENGTH_LONG).show()
            }
        }
    }
}