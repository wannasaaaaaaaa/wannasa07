package com.example.vehiclewannasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class honda5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_honda5)

        val bt51: Button = findViewById(R.id.bt51)
        val bt52: Button = findViewById(R.id.bt52)
        val bt53: Button = findViewById(R.id.bt53)
        val bt54: Button = findViewById(R.id.bt54)

        var numrand: Int = 0

        val receivedIntent = intent


        bt51.setOnClickListener {
            val intent = Intent(this, honda6::class.java)
            intent.putExtra("jumeng", numrand+1)
            startActivity(intent)
        }
        bt52.setOnClickListener {
            val intent = Intent(this, honda6::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        bt53.setOnClickListener {
            val intent = Intent(this, honda6::class.java)
            intent.putExtra("jumeng",numrand)
            startActivity(intent)
        }
        bt54.setOnClickListener {
            val intent = Intent(this,  honda6::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}