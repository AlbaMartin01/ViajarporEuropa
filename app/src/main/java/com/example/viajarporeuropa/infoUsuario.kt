package com.example.viajarporeuropa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class infoUsuario : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_usuario)
        var pagina = intent.getStringExtra("paginaRec")
        var nombreCiu = intent.getStringExtra("nombreCiudad")
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
                intento.putExtra("ciudad",nombreCiu)
                intento.putExtra("id", IDciudad)
                startActivity(intento)
            }
        }
    }
}