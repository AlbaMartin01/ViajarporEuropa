package com.example.viajarporeuropa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.IntentSenderRequest
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var authStateListener: FirebaseAuth.AuthStateListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btningresar : Button = findViewById(R.id.aceptarLogin)
        val txtemail: TextView = findViewById(R.id.usuarioLogin)
        val txtpassword: TextView = findViewById(R.id.contrLogin)

        firebaseAuth = Firebase.auth
        btningresar.setOnClickListener{
            singIn(txtemail.text.toString(),txtpassword.text.toString())
        }
    }

    private fun singIn (email: String, password: String){
        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this){task ->
            if(task.isSuccessful){
                val user = firebaseAuth.currentUser
                Toast.makeText(this, user?.uid.toString(), Toast.LENGTH_SHORT).show()
                val intento = Intent(this, ListaPaisesEU::class.java)
            } else{
                Toast.makeText(this, "Error de Email y/o contraseña", Toast.LENGTH_SHORT).show()
            }
        }
    }
}