package com.example.a10120230latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val regBtn = findViewById<TextView>(R.id.register)
        regBtn.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            // start your next activity
            startActivity(intent)
        }


    }
}