package com.example.vehiclewannasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class honda4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_honda4)

        val bt41: Button = findViewById(R.id.bt41)
        val bt42: Button = findViewById(R.id.bt42)
        val bt43: Button = findViewById(R.id.bt43)
        val bt44: Button = findViewById(R.id.bt44)

        var numrand: Int = 0

        val receivedIntent = intent


        bt41.setOnClickListener {
            val intent = Intent(this, honda5::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        bt42.setOnClickListener {
            val intent = Intent(this, honda5::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        bt43.setOnClickListener {
            val intent = Intent(this, honda5::class.java)
            intent.putExtra("jumeng",numrand)
            startActivity(intent)
        }
        bt44.setOnClickListener {
            val intent = Intent(this,  honda5::class.java)
            intent.putExtra("jumeng", numrand+1)
            startActivity(intent)
        }
    }
}