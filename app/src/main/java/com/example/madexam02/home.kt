package com.example.madexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val imageView25: ImageView = findViewById(R.id.imageView18)
        imageView25.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        val btnNavigate: Button = findViewById(R.id.button7)
        btnNavigate.setOnClickListener {
            val intent = Intent(this,doctor::class.java)
            startActivity(intent)
        }

        val btnNavigate2: Button = findViewById(R.id.button6)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this,community::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}