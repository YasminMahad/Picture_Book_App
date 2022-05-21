package com.example.picturebook

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Book2 : AppCompatActivity() {
    lateinit var btnNext2: Button
    lateinit var btnBack2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book2)

        btnNext2 = findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            val intent = Intent(this,Book3::class.java)
            startActivity(intent)
        }
        btnBack2 = findViewById(R.id.btnBack2)
        btnBack2.setOnClickListener {
            val intent = Intent(this,Book1::class.java)
            startActivity(intent)
        }
    }
}