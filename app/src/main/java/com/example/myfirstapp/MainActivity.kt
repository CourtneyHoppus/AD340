package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val duration = Toast.LENGTH_SHORT

        val toastButton: Button = findViewById(R.id.toastButton)

        val resetButton: Button = findViewById(R.id.resetButton)
        val incrementButton: Button = findViewById(R.id.incrementButton)
        val decrementButton: Button = findViewById(R.id.decrementButton)
        val countView: TextView = findViewById(R.id.countText)

        val resetCount = 0
        var currentCount = 0
        var newCount: Int

        val foodButton: Button = findViewById(R.id.foodButton)
        val touchButton: Button = findViewById(R.id.touchButton)
        val shibaImage: ImageView = findViewById(R.id.shibaImage)

        toastButton.setOnClickListener {
            val text = "Cheers, that was a Toast"
            Toast.makeText(applicationContext, text, duration).show()
        }

        resetButton.setOnClickListener {
            val text = "You reset the count from $currentCount to $resetCount"
            currentCount = resetCount
            countView.text = currentCount.toString()
            Toast.makeText(applicationContext, text, duration).show()
        }

        incrementButton.setOnClickListener {
            newCount = currentCount.inc()
            val text = "You incremented the counter from $currentCount to $newCount"
            currentCount = newCount
            countView.text = currentCount.toString()
            Toast.makeText(applicationContext, text, duration).show()
        }

        decrementButton.setOnClickListener {
            newCount = currentCount.dec()
            val text = "You decremented the counter from $currentCount to $newCount"
            currentCount = newCount
            countView.text = currentCount.toString()
            Toast.makeText(applicationContext, text, duration).show()
        }

        foodButton.setOnClickListener {
            shibaImage.setImageResource(R.drawable.calm_shiba)
            val text = "Feeding me was the right choice."
            Toast.makeText(applicationContext, text, duration).show()
        }

        touchButton.setOnClickListener {
            shibaImage.setImageResource(R.drawable.angry_shiba)
            val text = "I said don't touch, try feeding me."
            Toast.makeText(applicationContext, text, duration).show()
        }
    }
}
