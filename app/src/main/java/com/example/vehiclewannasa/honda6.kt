package com.example.vehiclewannasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class honda6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_honda6)

        val bt61: Button = findViewById(R.id.bt61)
        val bt62: Button = findViewById(R.id.bt62)
        val bt63: Button = findViewById(R.id.bt63)
        val bt64: Button = findViewById(R.id.bt64)

        var numrand: Int = 0

        val receivedIntent = intent


        bt61.setOnClickListener {
            val intent = Intent(this, honda7::class.java)
            intent.putExtra("jumeng", numrand+1)
            startActivity(intent)
        }
        bt62.setOnClickListener {
            val intent = Intent(this, honda7::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        bt63.setOnClickListener {
            val intent = Intent(this, honda7::class.java)
            intent.putExtra("jumeng",numrand)
            startActivity(intent)
        }
        bt64.setOnClickListener {
            val intent = Intent(this,  honda7::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}