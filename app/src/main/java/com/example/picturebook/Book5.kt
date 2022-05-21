package com.example.picturebook

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Book5 : AppCompatActivity() {
    lateinit var btnBack5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book5)


        btnBack5 = findViewById(R.id.btnBack5)
        btnBack5.setOnClickListener {
            val intent = Intent(this,Book4::class.java)
            startActivity(intent)
        }
    }
}