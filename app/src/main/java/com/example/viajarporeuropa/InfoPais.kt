 package com.example.viajarporeuropa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore

 class InfoPais : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_pais)

        val db : FirebaseFirestore = FirebaseFirestore.getInstance()

        db.collection("InfoPaises").document("Madrid")

    }
}