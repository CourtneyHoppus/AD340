package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListActivity : AppCompatActivity() {
    private val data = ArrayList<ListModel>()
    private val pins : Array<Array<String>> = arrayOf(
        arrayOf(
            "Terminator 2: Judgement Day",
            "Williams, 1991"
        ),
        arrayOf(
            "Cactus Canyon (Remake Special)",
            "Chicago Gaming, 2021"
        ),
        arrayOf(
            "Game of Thrones (LE)",
            "Stern, 2015"
        ),
        arrayOf(
            "Iron Maiden: Legacy of the Beast (Pro)",
            "Stern, 2018"
        ),
        arrayOf(
            "Deadpool (Premium)",
            "Stern, 2018"
        ),
        arrayOf(
            "Foo Fighters (Pro)",
            "Stern, 2023"
        ),
        arrayOf(
            "Avengers, Infinity Quest (Premium)",
            "Stern, 2020"
        ),
        arrayOf(
            "Jack-Bot",
            "Williams, 1995"
        ),
        arrayOf(
            "Lord of the Rings",
            "Stern, 2003"
        ),
        arrayOf(
            "Medieval Madness",
            "Williams, 1997"
        ),
        arrayOf(
            "Metallica (Premium)",
            "Stern, 2013"
        ),
        arrayOf(
            "Monster Bash",
            "Williams, 1998"
        )
    )
    private fun pinsList() {
        for (pin in pins)
            data.add(ListModel(pin[0], pin[1]))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        pinsList()

        val backButton: Button = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }

        val rv: RecyclerView = findViewById<RecyclerView>(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = ListAdapter(data)
    }
}
