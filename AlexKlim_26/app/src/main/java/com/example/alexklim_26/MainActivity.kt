package com.example.alexklim_26

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val settings_button : Button = findViewById(R.id.settings)
        settings_button.setOnClickListener {
            val intent = Intent(this@MainActivity, MyPreferenceActivity::class.java)
            startActivity(intent)
        }
    }
}