package com.example.picturebook

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Book1 : AppCompatActivity() {
    lateinit var btnNext1: Button
    lateinit var btnBack1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book1)
        btnNext1 = findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            val intent = Intent(this,Book2::class.java)
            startActivity(intent)
        }
        btnBack1 = findViewById(R.id.btnBack1)
        btnBack1.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}