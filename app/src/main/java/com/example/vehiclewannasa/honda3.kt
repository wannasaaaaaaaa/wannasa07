package com.example.vehiclewannasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class honda3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_honda3)

        val bt31: Button = findViewById(R.id.bt31)
        val bt32: Button = findViewById(R.id.bt32)
        val bt33: Button = findViewById(R.id.bt33)
        val bt34: Button = findViewById(R.id.bt34)

        var numrand: Int = 0

        val receivedIntent = intent


        bt31.setOnClickListener {
            val intent = Intent(this, honda4::class.java)
            intent.putExtra("jumeng", numrand+1)
            startActivity(intent)
        }
        bt32.setOnClickListener {
            val intent = Intent(this, honda4::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        bt33.setOnClickListener {
            val intent = Intent(this, honda4::class.java)
            intent.putExtra("jumeng",numrand)
            startActivity(intent)
        }
        bt34.setOnClickListener {
            val intent = Intent(this,  honda4::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}