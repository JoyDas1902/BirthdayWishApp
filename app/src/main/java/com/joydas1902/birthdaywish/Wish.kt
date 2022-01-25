package com.joydas1902.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Wish : AppCompatActivity() {
    companion object { const val NAME_EXTRA = "name_extra" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wish)

        val name = intent.getStringExtra(NAME_EXTRA)
        val btext = findViewById<TextView>(R.id.btext)
        btext.text = "Happy Birthday \n$name! \n\nLive your life with smiles, not tears. Remember that the best is yet to come. I pray all your birthday wishes to come true."

    }
}