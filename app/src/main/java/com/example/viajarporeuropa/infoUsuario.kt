package com.example.viajarporeuropa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class infoUsuario : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_usuario)

        val db : FirebaseFirestore = FirebaseFirestore.getInstance()

        var pagina = intent.getStringExtra("paginaRec")
        var IDciudad = intent.getStringExtra("idCiu")

        var auth = FirebaseAuth.getInstance()


        findViewById<TextView>(R.id.nombreUsuario).setText(auth.currentUser?.email.toString())

        findViewById<TextView>(R.id.uid).setText(auth.currentUser?.uid)

        findViewById<Button>(R.id.usuarioLogOut).setOnClickListener {
            auth.signOut()
            var intento = Intent(this, Login::class.java)
            startActivity(intento)
        }

        findViewById<ImageButton>(R.id.atrasPaginaUsuario).setOnClickListener {
            if (pagina.equals("listaPaises")){
                var intento = Intent(this, ListaPaisesEU::class.java)
                startActivity(intento)
            } else if(pagina.equals("infoPaises")){
                var intento = Intent(this, InfoPais::class.java)
                intento.putExtra("id", IDciudad)
                startActivity(intento)
            }
        }

        val documentRef = db.collection("UsuariosLugaresFavoritos").document(auth.currentUser?.email.toString())
        documentRef.get().addOnSuccessListener { documentSnapshot ->
            if (documentSnapshot.exists()) {
                val data = documentSnapshot.data
                val campos = data?.keys ?: emptySet()

                val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)

                for (campo in campos) {
                    val button = Button(this)
                    var ciudad = documentSnapshot.get(campo).toString()
                    button.text = ciudad
                    button.setOnClickListener {
                        var intento = Intent(this,InfoPais::class.java)
                        intento.putExtra("ciudad",ciudad)
                        intento.putExtra("id", campo)
                        startActivity(intento)
                    }

                    linearLayout.addView(button)
                }
            }
        }
    }
}