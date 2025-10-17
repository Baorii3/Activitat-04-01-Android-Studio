package com.example.activitat_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StartActivity : AppCompatActivity() {

    lateinit var boto1: Button
    lateinit var boto2: Button
    lateinit var boto3: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        var intent = this.intent
        var nom = intent.getStringExtra("nom")
        title=nom
        val miTextView: TextView = findViewById(R.id.tvNomStart)
        miTextView.text = nom;

        val numeroEndevinar = (1..3).random()
        boto1 = findViewById(R.id.btn1)
        boto2 = findViewById(R.id.btn2)
        boto3 = findViewById(R.id.btn3)


        fun canviPantalla(num: Int) {
            val activity = if (num == numeroEndevinar) SuccessActivity::class.java else ErrorActivity::class.java

            val intent = Intent(this, activity)
            intent.putExtra("numeroEndevinar", numeroEndevinar)
            intent.putExtra("num", num)
            intent.putExtra("nom", nom)
            startActivity(intent)
        }

        boto1.setOnClickListener { canviPantalla(1) }
        boto2.setOnClickListener { canviPantalla(2) }
        boto3.setOnClickListener { canviPantalla(3) }

    }
}