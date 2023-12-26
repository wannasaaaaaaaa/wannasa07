package com.example.vehiclewannasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class honda7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_honda7)

        val bt71: Button = findViewById(R.id.bt71)
        val bt72: Button = findViewById(R.id.bt72)
        val bt73: Button = findViewById(R.id.bt73)
        val bt74: Button = findViewById(R.id.bt74)

        var numrand: Int = 0

        val receivedIntent = intent


        bt71.setOnClickListener {
            val intent = Intent(this, honda8::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        bt72.setOnClickListener {
            val intent = Intent(this, honda8::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        bt73.setOnClickListener {
            val intent = Intent(this, honda8::class.java)
            intent.putExtra("jumeng",numrand)
            startActivity(intent)
        }
        bt74.setOnClickListener {
            val intent = Intent(this,  honda8::class.java)
            intent.putExtra("jumeng", numrand+1)
            startActivity(intent)
        }
    }
}