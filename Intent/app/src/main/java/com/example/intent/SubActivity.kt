package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        var b = findViewById<Button>(R.id.button2)
        b.setOnClickListener {
            val intent = Intent(this,SubActivity::class.java)
            finish()
        }
    }
}