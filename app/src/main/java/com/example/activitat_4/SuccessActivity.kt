package com.example.activitat_4

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SuccessActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var botoVolver: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)
        var intent = this.intent

        var nom = intent.getStringExtra("nom")
        var num = intent.getIntExtra("num",0)
        var numEndevinar = intent.getIntExtra("numeroEndevinar",0)
        textView = findViewById(R.id.textExit)
        textView.text = "Felicitats $nom, has adivinat el numero $numEndevinar, escollint el $num"

        botoVolver = findViewById(R.id.btnVolverSucces)
        botoVolver.setOnClickListener {
            finish()
        }
    }
}