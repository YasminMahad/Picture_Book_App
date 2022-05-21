package com.example.picturebook

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Book3 : AppCompatActivity() {
    lateinit var btnNext3: Button
    lateinit var btnBack3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book3)

        btnNext3 = findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent = Intent(this,Book4::class.java)
            startActivity(intent)
        }
        btnBack3 = findViewById(R.id.btnBack3)
        btnBack3.setOnClickListener {
            val intent = Intent(this,Book2::class.java)
            startActivity(intent)
        }
    }
}