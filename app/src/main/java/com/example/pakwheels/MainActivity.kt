package com.example.pakwheels

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.bottom_home -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.bottom_myads -> {
                    replaceFragment(MyAdsFragment())
                    true
                }
                R.id.bottom_chat -> {
                    replaceFragment(ChatFragment())
                    true
                }
                R.id.bottom_menu -> {
                    replaceFragment(MenuFragment())
                    true
                }
                else -> false
            }
        }

        val fabSell: FloatingActionButton = findViewById(R.id.bottom_fab)
        fabSell.setOnClickListener {
            replaceFragment(SellNowFragment())
        }

        replaceFragment(HomeFragment())
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_container, fragment)
            .commit()
    }
}
