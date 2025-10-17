package com.example.activitat_4

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ErrorActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var botoVolver: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)
        var intent = this.intent

        var nom = intent.getStringExtra("nom")
        var num = intent.getIntExtra("num",0)
        var numEndevinar = intent.getIntExtra("numeroEndevinar",0)
        textView = findViewById(R.id.textError)
        textView.text = "Tristement $nom, NO has adivinat el numero $numEndevinar, escollint el $num"
        botoVolver = findViewById(R.id.btnVolverError)
        botoVolver.setOnClickListener {
            finish()
        }
    }
}