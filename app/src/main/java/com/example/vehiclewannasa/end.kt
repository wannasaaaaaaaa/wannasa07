package com.example.vehiclewannasa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextPaint
import java.io.Serializable

class end : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        val total = try {
            TextPaint(R.id.total)
        } catch (e: Exception) {
            TODO("Not yet implemented")
        }

        val receivedIntent = intent
        val numrand = receivedIntent.getIntExtra("jumeng", 0)
        total.set (numrand.toString())
    }
}

private fun TextPaint.set(string: Serializable) {
    TODO("Not yet implemented")
}
