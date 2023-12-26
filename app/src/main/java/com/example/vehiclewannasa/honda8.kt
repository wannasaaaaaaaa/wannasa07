
package com.example.vehiclewannasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class honda8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_honda8)

        val bt81: Button = findViewById(R.id.bt81)
        val bt82: Button = findViewById(R.id.bt82)
        val bt83: Button = findViewById(R.id.bt83)
        val bt84: Button = findViewById(R.id.bt84)

        var numrand: Int = 0

        val receivedIntent = intent


        bt81.setOnClickListener {
            val intent = Intent(this, honda9::class.java)
            intent.putExtra("jumeng", numrand+1)
            startActivity(intent)
        }
        bt82.setOnClickListener {
            val intent = Intent(this, honda9::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        bt83.setOnClickListener {
            val intent = Intent(this, honda9::class.java)
            intent.putExtra("jumeng",numrand)
            startActivity(intent)
        }
        bt84.setOnClickListener {
            val intent = Intent(this,  honda9::class.java)
            intent.putExtra("jumeng", numrand+1)
            startActivity(intent)
        }
    }
}