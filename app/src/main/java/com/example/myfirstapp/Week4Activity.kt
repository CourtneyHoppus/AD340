package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.myfirstapp.databinding.ActivityWeek4Binding

class Week4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week4)

        val binding: ActivityWeek4Binding = DataBindingUtil.setContentView (
            this, R.layout.activity_week4)

        val duration = Toast.LENGTH_SHORT

        val resetCount = 0
        var currentCount = 0
        var newCount: Int

        binding.count = currentCount.toString()

        binding.backButton.setOnClickListener {
            finish()
        }

        binding.recyclerViewButton.setOnClickListener {
            startActivity(Intent(this@Week4Activity, RecycleViewActivity::class.java))
        }

        binding.listButton.setOnClickListener {
            startActivity(Intent(this@Week4Activity, ListActivity::class.java))
        }

        binding.toastButton.setOnClickListener {
            val text = "Cheers, that was a Toast, again!"
            Toast.makeText(applicationContext, text, duration).show()
        }

        binding.resetButton.setOnClickListener {
            val text = "You reset the count from $currentCount to $resetCount"
            currentCount = resetCount
            binding.count = currentCount.toString()
            Toast.makeText(applicationContext, text, duration).show()
        }

        binding.incrementButton.setOnClickListener {
            newCount = currentCount.inc()
            val text = "You incremented the counter from $currentCount to $newCount"
            currentCount = newCount
            binding.count = currentCount.toString()
            Toast.makeText(applicationContext, text, duration).show()
        }

        binding.decrementButton.setOnClickListener {
            newCount = currentCount.dec()
            val text = "You decremented the counter from $currentCount to $newCount"
            currentCount = newCount
            binding.count = currentCount.toString()
            Toast.makeText(applicationContext, text, duration).show()
        }
    }
}
