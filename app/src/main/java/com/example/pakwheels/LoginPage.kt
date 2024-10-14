package com.example.pakwheels

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val phoneInput = findViewById<EditText>(R.id.phoneInput)
        val continueMobileButton = findViewById<Button>(R.id.continueMobileButton)

        continueMobileButton.setOnClickListener {
            val phoneNumber = phoneInput.text.toString()
            // Proceed with phone number logic
        }

        findViewById<Button>(R.id.continueGoogleButton).setOnClickListener {
            // Handle Google login
        }

        findViewById<Button>(R.id.continueFacebookButton).setOnClickListener {
            // Handle Facebook login
        }

        findViewById<Button>(R.id.continueEmailButton).setOnClickListener {
            // Handle Email login
        }
    }
}
