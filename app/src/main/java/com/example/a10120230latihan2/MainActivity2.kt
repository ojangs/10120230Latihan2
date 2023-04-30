package com.example.a10120230latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val registerBtn = findViewById<ImageButton>(R.id.register_Btn)
        registerBtn.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}