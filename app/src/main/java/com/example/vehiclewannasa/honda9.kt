package com.example.vehiclewannasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class honda9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_honda9)

        val bt91: Button = findViewById(R.id.bt91)
        val bt92: Button = findViewById(R.id.bt92)
        val bt93: Button = findViewById(R.id.bt93)
        val bt94: Button = findViewById(R.id.bt94)

        var numrand: Int = 0

        val receivedIntent = intent


        bt91.setOnClickListener {
            val intent = Intent(this, honda10::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        bt92.setOnClickListener {
            val intent = Intent(this, honda10::class.java)
            intent.putExtra("jumeng", numrand+1)
            startActivity(intent)
        }
        bt93.setOnClickListener {
            val intent = Intent(this, honda10::class.java)
            intent.putExtra("jumeng",numrand)
            startActivity(intent)
        }
        bt94.setOnClickListener {
            val intent = Intent(this,  honda10::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}