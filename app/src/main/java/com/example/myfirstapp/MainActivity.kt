package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val week3Button: Button = findViewById(R.id.week3Button)
        val week4Button: Button = findViewById(R.id.week4Button)

        week3Button.setOnClickListener {
            startActivity(Intent(this@MainActivity, Week3Activity::class.java))
        }

        week4Button.setOnClickListener {
            startActivity(Intent(this@MainActivity, Week4Activity::class.java))
        }
    }
}
