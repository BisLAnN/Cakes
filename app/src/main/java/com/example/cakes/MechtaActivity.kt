package com.example.cakes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MechtaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mechta)

        supportActionBar?.hide()
    }
}