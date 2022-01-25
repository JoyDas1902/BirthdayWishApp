package com.joydas1902.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val name = findViewById<EditText>(R.id.name).editableText.toString()
            val intent = Intent(this, Wish::class.java)
            intent.putExtra(Wish.NAME_EXTRA, name)
            startActivity(intent)
        }
    }
}