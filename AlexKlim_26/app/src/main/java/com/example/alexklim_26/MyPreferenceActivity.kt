package com.example.alexklim_26

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MyPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content, SettingsFragment())
            .commit()
    }
}
