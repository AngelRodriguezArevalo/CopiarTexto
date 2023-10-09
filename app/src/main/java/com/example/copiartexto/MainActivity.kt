package com.example.copiartexto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.copiartexto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        var btn = findViewById<Button>(R.id.button)

        var texto = findViewById<EditText>(R.id.nombre)

        var cuadroSaludo = findViewById<TextView>(R.id.saludo)

        var limpiar = findViewById<Button>(R.id.Limpiar)

        btn.setOnClickListener {
            cuadroSaludo.text = "Hola, " + texto.text.toString()
        }

        limpiar.setOnClickListener {
            texto.text.clear()
            cuadroSaludo.text = "";
        }

         */

        binding.button.setOnClickListener {
            binding.saludo.text = "Hola " + binding.nombre.text.toString()
            Toast.makeText(this, binding.nombre.text.toString(), Toast.LENGTH_LONG).show()
        }
        binding.Limpiar.setOnClickListener {
            binding.nombre.text.clear()
            binding.saludo.text = ""
        }
    }
}