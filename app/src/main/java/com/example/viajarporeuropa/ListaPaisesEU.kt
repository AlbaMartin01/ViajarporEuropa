package com.example.viajarporeuropa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Spinner

class ListaPaisesEU : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_paises_eu)

        var nombUsuario = intent.getStringExtra("nombreUsuario")
        var paginaRecivida = "listaPaises"

        var nombreCiudad = ""

        findViewById<ImageButton>(R.id.atrasListaPaises).setOnClickListener {
            var intento = Intent(this, Login::class.java)
            startActivity(intento)
        }

        findViewById<ImageButton>(R.id.infoUsuario).setOnClickListener {
            var intento = Intent (this, infoUsuario::class.java)
            intento.putExtra("nombreUsuario", nombUsuario)
            intento.putExtra("paginaRec", paginaRecivida)
            startActivity(intento)
        }

        findViewById<Button>(R.id.aceptarInfoPais).setOnClickListener {
            var intento = Intent(this,InfoPais::class.java)
            intento.putExtra("nombreUsuario", nombUsuario)
            if (findViewById<RadioButton>(R.id.amsterdam).isChecked) {
                intento.putExtra("ciudad", "Ámsterdam - Países Bajos")
                intento.putExtra("id", "Amsterdam")
            } else if (findViewById<RadioButton>(R.id.atenas).isChecked) {
                intento.putExtra("ciudad", "Atenas - Grecia")
                intento.putExtra("id", "Atenas")
            } else if (findViewById<RadioButton>(R.id.berlin).isChecked) {
                intento.putExtra("ciudad", "Berlin - Alemania")
                intento.putExtra("id", "Berlin")
            } else if (findViewById<RadioButton>(R.id.bratislava).isChecked) {
                intento.putExtra("ciudad", "Bratislava - Eslovaquia")
                intento.putExtra("id", "Bratislava")
            } else if (findViewById<RadioButton>(R.id.bruselas).isChecked) {
                intento.putExtra("ciudad", "Bruselas - Bélgica")
                intento.putExtra("id", "Bruselas")
            } else if (findViewById<RadioButton>(R.id.bucarest).isChecked) {
                intento.putExtra("ciudad", "Bucarest - Rumanía")
                intento.putExtra("id", "Bucarest")
            } else if (findViewById<RadioButton>(R.id.budapest).isChecked) {
                intento.putExtra("ciudad", "Budapest - Hungría")
                intento.putExtra("id", "Budapest")
            } else if (findViewById<RadioButton>(R.id.copenhague).isChecked) {
                intento.putExtra("ciudad", "Copenhague - Dinamarca")
                intento.putExtra("id", "Copenhague")
            } else if (findViewById<RadioButton>(R.id.dublin).isChecked) {
                intento.putExtra("ciudad", "Dublin - Irlanda")
                intento.putExtra("id", "Dublin")
            } else if (findViewById<RadioButton>(R.id.estocolmo).isChecked) {
                intento.putExtra("ciudad", "Estocolmo - Suecia")
                intento.putExtra("id", "Estocolmo")
            } else if (findViewById<RadioButton>(R.id.helsinki).isChecked) {
                intento.putExtra("ciudad", "Helsinki - Finlandia")
                intento.putExtra("id", "Helsinki")
            } else if (findViewById<RadioButton>(R.id.laValeta).isChecked) {
                intento.putExtra("ciudad", "La Valeta - Malta")
                intento.putExtra("id", "La Valleta")
            } else if (findViewById<RadioButton>(R.id.lisboa).isChecked) {
                intento.putExtra("ciudad", "Lisboa - Portugal")
                intento.putExtra("id", "Lisboa")
            } else if (findViewById<RadioButton>(R.id.liubliana).isChecked) {
                intento.putExtra("ciudad", "Liubliana - Eslovenia")
                intento.putExtra("id", "Liubliana")
            } else if (findViewById<RadioButton>(R.id.luxemburgo).isChecked) {
                intento.putExtra("ciudad", "Luxemburgo - Luxemburgo")
                intento.putExtra("id", "Luxemburgo")
            } else if (findViewById<RadioButton>(R.id.madrid).isChecked) {
                intento.putExtra("ciudad", "Madrid - España")
                intento.putExtra("id", "Madrid")
            } else if (findViewById<RadioButton>(R.id.oslo).isChecked) {
                intento.putExtra("ciudad", "Oslo - Noruega")
                intento.putExtra("id", "Oslo")
            } else if (findViewById<RadioButton>(R.id.paris).isChecked) {
                intento.putExtra("ciudad", "París - Francia")
                intento.putExtra("id", "Paris")
            } else if (findViewById<RadioButton>(R.id.praga).isChecked) {
                intento.putExtra("ciudad", "Praga - República Checa (Chequia)")
                intento.putExtra("id", "Amsterdam")
            } else if (findViewById<RadioButton>(R.id.riga).isChecked) {
                intento.putExtra("ciudad", "Riga - Letonia")
                intento.putExtra("id", "Riga")
            } else if (findViewById<RadioButton>(R.id.roma).isChecked) {
                intento.putExtra("ciudad", "Roma - Italia")
                intento.putExtra("id", "Roma")
            } else if (findViewById<RadioButton>(R.id.tallin).isChecked) {
                intento.putExtra("ciudad", "Tallin - Estonia")
                intento.putExtra("id", "Tallin")
            } else if (findViewById<RadioButton>(R.id.Varsovia).isChecked) {
                intento.putExtra("ciudad", "Varsovia - Polonia")
                intento.putExtra("id", "Varsovia")
            } else if (findViewById<RadioButton>(R.id.viena).isChecked) {
                intento.putExtra("ciudad", "Viena - Austria")
                intento.putExtra("id", "Viena")
            } else if (findViewById<RadioButton>(R.id.amsterdam).isChecked) {
                intento.putExtra("ciudad", "Vilnius - Lituania")
                intento.putExtra("id", "Vilnius")
            } else if (findViewById<RadioButton>(R.id.zagreb).isChecked) {
                intento.putExtra("ciudad", "Zagreb - Croacia")
                intento.putExtra("id", "Zagreb")
            }

            startActivity(intento)
        }

    }
}