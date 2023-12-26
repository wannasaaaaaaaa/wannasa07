
package com.example.vehiclewannasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class honda10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_honda10)

        val bt101: Button = findViewById(R.id.bt101)
        val bt102: Button = findViewById(R.id.bt102)
        val bt103: Button = findViewById(R.id.bt103)
        val bt104: Button = findViewById(R.id.bt104)

        var numrand: Int = 0

        val receivedIntent = intent


        bt101.setOnClickListener {
            val intent = Intent(this, end::class.java)
            intent.putExtra("jumeng", numrand+1)
            startActivity(intent)
        }
        bt102.setOnClickListener {
            val intent = Intent(this, end::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        bt103.setOnClickListener {
            val intent = Intent(this, end::class.java)
            intent.putExtra("jumeng",numrand)
            startActivity(intent)
        }
        bt104.setOnClickListener {
            val intent = Intent(this,  end::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}