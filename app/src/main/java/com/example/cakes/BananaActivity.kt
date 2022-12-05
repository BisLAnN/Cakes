package com.example.cakes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BananaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banana)

        supportActionBar?.hide()
    }
}