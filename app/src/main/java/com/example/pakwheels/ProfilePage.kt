package com.example.pakwheels

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        val userName = findViewById<TextView>(R.id.userName)
        val userEmail = findViewById<TextView>(R.id.userEmail)

        findViewById<Button>(R.id.editProfileButton).setOnClickListener {
            // Handle profile editing
        }

        findViewById<Button>(R.id.logoutButton).setOnClickListener {
            // Handle logout
        }
    }
}
