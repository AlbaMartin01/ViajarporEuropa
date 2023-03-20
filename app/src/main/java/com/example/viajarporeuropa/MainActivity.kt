package com.example.viajarporeuropa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.login).setOnClickListener {
            var intento = Intent(this, Login::class.java)
            startActivity(intento)
        }

        findViewById<Button>(R.id.registrar).setOnClickListener {
            var intento = Intent(this, Registrar::class.java)
            startActivity(intento)
        }
    }
}