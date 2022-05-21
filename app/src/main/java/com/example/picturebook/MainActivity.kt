package com.example.picturebook

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnViewImage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnViewImage = findViewById(R.id.btnViewImage)

        btnViewImage.setOnClickListener {
            val intent = Intent(this,Book1::class.java)
            startActivity(intent)
        }
    }
}