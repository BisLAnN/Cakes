package com.example.cakes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class VanilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vanil)

        supportActionBar?.hide()
    }
}