package com.example.picturebook

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Book4 : AppCompatActivity() {
    lateinit var btnNext4: Button
    lateinit var btnBack4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book4)

        btnNext4 = findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            val intent = Intent(this,Book5::class.java)
            startActivity(intent)
        }
        btnBack4 = findViewById(R.id.btnBack4)
        btnBack4.setOnClickListener {
            val intent = Intent(this,Book3::class.java)
            startActivity(intent)
        }
    }
}