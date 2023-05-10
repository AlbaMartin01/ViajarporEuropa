 package com.example.viajarporeuropa

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

 class InfoPais : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_pais)

        val db : FirebaseFirestore = FirebaseFirestore.getInstance()

        var nombUsuario = intent.getStringExtra("nombreUsuario")
        var paginaRecivida = "infoPaises"
        var nombCiudad = intent.getStringExtra("ciudad")
        var idCiudad = intent.getStringExtra("id").toString()

        db.collection("InfoPaises").document(idCiudad).get().addOnSuccessListener {document ->
            if (document.exists()){
                var idioma = document.data?.get("Idioma").toString()
                findViewById<TextView>(R.id.idioma).setText(idioma)
                var moneda = document.data?.get("moneda").toString()
                findViewById<TextView>(R.id.moneda).setText(moneda)
                var sitio1 = document.data?.get("sitio1").toString()
                findViewById<TextView>(R.id.sitio1).setText(sitio1)
                var sitio2 = document.data?.get("sitio2").toString()
                findViewById<TextView>(R.id.sitio2).setText(sitio2)
                var sitio3 = document.data?.get("sitio3").toString()
                findViewById<TextView>(R.id.sitio3).setText(sitio3)
                var sitio4 = document.data?.get("sitio4").toString()
                findViewById<TextView>(R.id.sitio4).setText(sitio4)
                var sitio5 = document.data?.get("sitio5").toString()
                findViewById<TextView>(R.id.sitio5).setText(sitio5)
                var sitio6 = document.data?.get("sitio6").toString()
                findViewById<TextView>(R.id.sitio6).setText(sitio6)
                var sitio7 = document.data?.get("sitio7").toString()
                findViewById<TextView>(R.id.sitio7).setText(sitio7)
                var sitio8 = document.data?.get("sitio8").toString()
                findViewById<TextView>(R.id.sitio8).setText(sitio8)

                var vuelos = document.data?.get("Vuelos").toString()
                findViewById<Button>(R.id.vuelos).setOnClickListener {
                    var uriUrlV = Uri.parse(vuelos)
                    var intento = Intent(Intent.ACTION_VIEW, uriUrlV)
                    startActivity(intento)
                }

                var hoteles = document.data?.get("hoteles").toString()
                findViewById<Button>(R.id.hoteles).setOnClickListener {
                    var uriUrlH = Uri.parse(hoteles)
                    var intento = Intent(Intent.ACTION_VIEW, uriUrlH)
                    startActivity(intento)
                }
            }
        }

        findViewById<ImageButton>(R.id.infoUsuario).setOnClickListener {
            var intento = Intent (this, infoUsuario::class.java)
            intento.putExtra("nombreUsuario", nombUsuario)
            intento.putExtra("paginaRec", paginaRecivida)
            intento.putExtra("nombreCiudad",nombCiudad)
            intento.putExtra("idCiu", idCiudad)
            startActivity(intento)
        }
        findViewById<ImageButton>(R.id.atrasListaPaises).setOnClickListener {
            var intento = Intent(this,ListaPaisesEU::class.java)
            startActivity(intento)
        }

        findViewById<TextView>(R.id.nombreDeCiudad).setText(nombCiudad)

    }
}