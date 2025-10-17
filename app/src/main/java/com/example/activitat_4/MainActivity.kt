package com.example.activitat_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Date


class MainActivity : AppCompatActivity() {
    lateinit var botoInici: Button
    lateinit var editTextNom: EditText
    lateinit var textViewFecha: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botoInici = findViewById(R.id.btn_inici)
        editTextNom = findViewById(R.id.etNom)
        textViewFecha = findViewById(R.id.textViewFecha)

        val fechaActual = Date()
        textViewFecha.text = fechaActual.toString()

        botoInici.setOnClickListener{
            val nom = editTextNom.text.toString().trim();
            val intent = Intent(this, StartActivity::class.java)
            intent.putExtra("nom",nom)
            startActivity(intent)

        }
    }
}