package com.example.cakes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }

    fun onCakeButtonClick(view: View) {
        val intent = Intent(this@MainActivity, CakeActivity::class.java)
        startActivity(intent)
    }

    fun onSmetannikClick(view: View) {
        val intent = Intent(this@MainActivity, SmetannikActivity::class.java)
        startActivity(intent)
    }

    fun onBananaButtonClick(view: View) {
        val intent = Intent(this@MainActivity, BananaActivity::class.java)
        startActivity(intent)
    }

    fun onVanilButtonClick(view: View) {
        val intent = Intent(this@MainActivity, VanilActivity::class.java)
        startActivity(intent)
    }

    fun onCherryButtonClick(view: View) {
        val intent = Intent(this@MainActivity, CherryActivity::class.java)
        startActivity(intent)
    }

    fun onMechtaButtonClick(view: View) {
        val intent = Intent(this@MainActivity, MechtaActivity::class.java)
        startActivity(intent)
    }

    fun onInfoButtonClick(view: View) {
        val intent = Intent(this@MainActivity, InfoActivity::class.java)
        startActivity(intent)
    }
}