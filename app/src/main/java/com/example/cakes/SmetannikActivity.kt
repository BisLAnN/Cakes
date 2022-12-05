package com.example.cakes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SmetannikActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smetannik)

        supportActionBar?.hide()
    }

}