package com.example.a10120230latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val verifyBtn = findViewById<ImageButton>(R.id.verivy_btn)
        verifyBtn.setOnClickListener{
            val intent = Intent(this, MainActivity4::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}