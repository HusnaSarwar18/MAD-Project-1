package com.example.pakwheels

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class SellNowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sell_now_page)

        val carBrandInput = findViewById<EditText>(R.id.carBrandInput)
        val carModelInput = findViewById<EditText>(R.id.carModelInput)
        val carPriceInput = findViewById<EditText>(R.id.carPriceInput)
        val sellNowButton = findViewById<Button>(R.id.sellNowButton)

        sellNowButton.setOnClickListener {
            val brand = carBrandInput.text.toString()
            val model = carModelInput.text.toString()
            val price = carPriceInput.text.toString()
            // Handle car selling logic
        }
    }
}
