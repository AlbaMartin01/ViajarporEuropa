 package com.example.viajarporeuropa

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions

 class InfoPais : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_pais)

        val db : FirebaseFirestore = FirebaseFirestore.getInstance()
        val auth = FirebaseAuth.getInstance()

        var nombUsuario = intent.getStringExtra("nombreUsuario")
        var paginaRecivida = "infoPaises"
        var idCiudad = intent.getStringExtra("id").toString()

        supportActionBar?.hide()

        var ciudad = ""

        db.collection("InfoPaises").document(idCiudad).get().addOnSuccessListener {document ->
            if (document.exists()){
                ciudad = document.data?.get("ciudad").toString()
                findViewById<TextView>(R.id.nombreDeCiudad).setText(ciudad)
                var idioma = document.data?.get("Idioma").toString()
                findViewById<TextView>(R.id.idioma).setText(idioma)
                var moneda = document.data?.get("moneda").toString()
                findViewById<TextView>(R.id.moneda).setText(moneda)

                var sitio1 = document.data?.get("sitio1").toString()
                findViewById<Button>(R.id.sitio1).setText(sitio1)
                findViewById<Button>(R.id.sitio1).setOnClickListener {
                    val texto = sitio1
                    val caracterAntiguo = ' '
                    val caracterNuevo = '+'
                    val nuevoTexto = reemplazarCaracter(texto, caracterAntiguo, caracterNuevo)
                    var uriUrl = Uri.parse("https://www.google.com/search?q=" + nuevoTexto)
                    var intento = Intent(Intent.ACTION_VIEW, uriUrl)
                    startActivity(intento)
                }

                var sitio2 = document.data?.get("sitio2").toString()
                findViewById<TextView>(R.id.sitio2).setText(sitio2)
                findViewById<Button>(R.id.sitio2).setOnClickListener {
                    val texto = sitio2
                    val caracterAntiguo = ' '
                    val caracterNuevo = '+'
                    val nuevoTexto = reemplazarCaracter(texto, caracterAntiguo, caracterNuevo)
                    var uriUrl = Uri.parse("https://www.google.com/search?q=" + nuevoTexto)
                    var intento = Intent(Intent.ACTION_VIEW, uriUrl)
                    startActivity(intento)
                }

                var sitio3 = document.data?.get("sitio3").toString()
                findViewById<TextView>(R.id.sitio3).setText(sitio3)
                findViewById<Button>(R.id.sitio3).setOnClickListener {
                    val texto = sitio3
                    val caracterAntiguo = ' '
                    val caracterNuevo = '+'
                    val nuevoTexto = reemplazarCaracter(texto, caracterAntiguo, caracterNuevo)
                    var uriUrl = Uri.parse("https://www.google.com/search?q=" + nuevoTexto)
                    var intento = Intent(Intent.ACTION_VIEW, uriUrl)
                    startActivity(intento)
                }

                var sitio4 = document.data?.get("sitio4").toString()
                findViewById<TextView>(R.id.sitio4).setText(sitio4)
                findViewById<Button>(R.id.sitio4).setOnClickListener {
                    val texto = sitio4
                    val caracterAntiguo = ' '
                    val caracterNuevo = '+'
                    val nuevoTexto = reemplazarCaracter(texto, caracterAntiguo, caracterNuevo)
                    var uriUrl = Uri.parse("https://www.google.com/search?q=" + nuevoTexto)
                    var intento = Intent(Intent.ACTION_VIEW, uriUrl)
                    startActivity(intento)
                }

                var sitio5 = document.data?.get("sitio5").toString()
                findViewById<TextView>(R.id.sitio5).setText(sitio5)
                findViewById<Button>(R.id.sitio5).setOnClickListener {
                    val texto = sitio5
                    val caracterAntiguo = ' '
                    val caracterNuevo = '+'
                    val nuevoTexto = reemplazarCaracter(texto, caracterAntiguo, caracterNuevo)
                    var uriUrl = Uri.parse("https://www.google.com/search?q=" + nuevoTexto)
                    var intento = Intent(Intent.ACTION_VIEW, uriUrl)
                    startActivity(intento)
                }

                var sitio6 = document.data?.get("sitio6").toString()
                findViewById<TextView>(R.id.sitio6).setText(sitio6)
                findViewById<Button>(R.id.sitio6).setOnClickListener {
                    val texto = sitio6
                    val caracterAntiguo = ' '
                    val caracterNuevo = '+'
                    val nuevoTexto = reemplazarCaracter(texto, caracterAntiguo, caracterNuevo)
                    var uriUrl = Uri.parse("https://www.google.com/search?q=" + nuevoTexto)
                    var intento = Intent(Intent.ACTION_VIEW, uriUrl)
                    startActivity(intento)
                }

                var sitio7 = document.data?.get("sitio7").toString()
                findViewById<TextView>(R.id.sitio7).setText(sitio7)
                findViewById<Button>(R.id.sitio7).setOnClickListener {
                    val texto = sitio7
                    val caracterAntiguo = ' '
                    val caracterNuevo = '+'
                    val nuevoTexto = reemplazarCaracter(texto, caracterAntiguo, caracterNuevo)
                    var uriUrl = Uri.parse("https://www.google.com/search?q=" + nuevoTexto)
                    var intento = Intent(Intent.ACTION_VIEW, uriUrl)
                    startActivity(intento)
                }

                var sitio8 = document.data?.get("sitio8").toString()
                findViewById<TextView>(R.id.sitio8).setText(sitio8)
                findViewById<Button>(R.id.sitio8).setOnClickListener {
                    val texto = sitio8
                    val caracterAntiguo = ' '
                    val caracterNuevo = '+'
                    val nuevoTexto = reemplazarCaracter(texto, caracterAntiguo, caracterNuevo)
                    var uriUrl = Uri.parse("https://www.google.com/search?q=" + nuevoTexto)
                    var intento = Intent(Intent.ACTION_VIEW, uriUrl)
                    startActivity(intento)
                }

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
            intento.putExtra("nombreCiudad",ciudad)
            intento.putExtra("idCiu", idCiudad)
            startActivity(intento)
        }
        findViewById<ImageButton>(R.id.atrasListaPaises).setOnClickListener {
            var intento = Intent(this,ListaPaisesEU::class.java)
            intento.putExtra("nombreUsuario", nombUsuario)
            startActivity(intento)
        }

        val documentRef =
            db.collection("UsuariosLugaresFavoritos").document(auth.currentUser?.email.toString())

        findViewById<Button>(R.id.añadirFavoritos).setOnClickListener {
            val data = hashMapOf(
                idCiudad to ciudad
            )

            documentRef.get().addOnSuccessListener { documentSnapshot ->
                if (!documentSnapshot.contains(idCiudad)) {
                    documentRef.set(data, SetOptions.merge()).addOnSuccessListener {
                        Toast.makeText(this,"Se ha añadido a favoritos correctamente",Toast.LENGTH_SHORT).show()
                        findViewById<Button>(R.id.añadirFavoritos).visibility = View.GONE
                        findViewById<Button>(R.id.eliminarFavoritos).visibility = View.VISIBLE
                    }.addOnFailureListener { exception ->
                        Toast.makeText(this, "No se ha añadido a favoritos correctamente", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }

        findViewById<Button>(R.id.eliminarFavoritos).setOnClickListener {
            val updates = HashMap<String, Any>()
            updates[idCiudad] = FieldValue.delete()
            documentRef.update(updates).addOnSuccessListener {
                Toast.makeText(this,"Se ha eliminado de favoritos correctamente",Toast.LENGTH_SHORT).show()
                findViewById<Button>(R.id.añadirFavoritos).visibility = View.VISIBLE
                findViewById<Button>(R.id.eliminarFavoritos).visibility = View.GONE

            }.addOnFailureListener {exception ->
                Toast.makeText(this,"Se ha producido un error",Toast.LENGTH_SHORT).show()

            }
        }

        documentRef.get().addOnSuccessListener { documentSnapshot ->
            if (documentSnapshot.contains(idCiudad)) {
                findViewById<Button>(R.id.añadirFavoritos).visibility = View.GONE
                findViewById<Button>(R.id.eliminarFavoritos).visibility = View.VISIBLE
            } else{
                findViewById<Button>(R.id.añadirFavoritos).visibility = View.VISIBLE
                findViewById<Button>(R.id.eliminarFavoritos).visibility = View.GONE
            }
        }
    }
     fun reemplazarCaracter(string: String, caracterAntiguo: Char, caracterNuevo: Char): String {
         return string.map { if (it == caracterAntiguo) caracterNuevo else it }
             .joinToString("")
     }
}