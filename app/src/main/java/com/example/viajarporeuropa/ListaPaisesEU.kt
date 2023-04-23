package com.example.viajarporeuropa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class ListaPaisesEU : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_paises_eu)

        var spinnerCountries: Spinner = findViewById(R.id.SpinnerPaises)

        var adapter: ArrayAdapter<CharSequence>  = ArrayAdapter.createFromResource(this,R.array.nombre_ciudades, android.R.layout.simple_spinner_item)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerCountries.setAdapter(adapter)
    }
}