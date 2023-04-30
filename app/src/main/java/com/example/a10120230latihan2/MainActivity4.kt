package com.example.a10120230latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val verifyBtn2 = findViewById<ImageButton>(R.id.verify_btn2)
        verifyBtn2.setOnClickListener{
            val intent = Intent(this, MainActivity5::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}