package com.example.pakwheels

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class BrowseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browse_page)

        val searchInput = findViewById<EditText>(R.id.searchInput)
        val categoryButton = findViewById<Button>(R.id.categoryButton)

        categoryButton.setOnClickListener {
            // Handle category button click
        }

        findViewById<Button>(R.id.budgetButton).setOnClickListener {
            // Handle budget button click
        }

        findViewById<Button>(R.id.brandButton).setOnClickListener {
            // Handle brand button click
        }
    }
}
