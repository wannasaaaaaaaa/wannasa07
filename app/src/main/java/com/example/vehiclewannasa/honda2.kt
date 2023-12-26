package com.example.vehiclewannasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class honda2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_honda2)

        val bt21: Button = findViewById(R.id.bt21)
        val bt22: Button = findViewById(R.id.bt22)
        val bt23: Button = findViewById(R.id.bt23)
        val bt24: Button = findViewById(R.id.bt24)

        var numrand: Int = 0

        val receivedIntent = intent


        bt21.setOnClickListener {
            val intent = Intent(this, honda3::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        bt22.setOnClickListener {
            val intent = Intent(this, honda3::class.java)
            intent.putExtra("jumeng", numrand+1)
            startActivity(intent)
        }
        bt23.setOnClickListener {
            val intent = Intent(this, honda3::class.java)
            intent.putExtra("jumeng",numrand)
            startActivity(intent)
        }
        bt24.setOnClickListener {
            val intent = Intent(this,  honda3::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }

    }
}