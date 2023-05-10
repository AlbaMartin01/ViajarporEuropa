package com.example.viajarporeuropa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class infoUsuario : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_usuario)
        var nomUsuario = intent.getStringExtra("nombreUsuario")
        var pagina = intent.getStringExtra("paginaRec")
        var nombreCiu = intent.getStringExtra("nombreCiudad")
        var IDciudad = intent.getStringExtra("idCiu")

        findViewById<TextView>(R.id.nombreUsuario).setText(nomUsuario)

        findViewById<ImageButton>(R.id.atrasPaginaUsuario).setOnClickListener {
            if (pagina.equals("listaPaises")){
                var intento = Intent(this, ListaPaisesEU::class.java)
                intento.putExtra("nombUsuario",nomUsuario)
                startActivity(intento)
            } else if(pagina.equals("infoPaises")){
                var intento = Intent(this, InfoPais::class.java)
                intento.putExtra("ciudad",nombreCiu)
                intento.putExtra("id", IDciudad)
                intento.putExtra("nombUsuario",nomUsuario)
                startActivity(intento)
            }
        }
    }
}