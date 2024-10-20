package com.example.pakwheels

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        // Set up the button click listener
        val continueMobileButton: Button = view.findViewById(R.id.continueMobileButton)
        continueMobileButton.setOnClickListener {
            navigateToOtpActivity()
        }

        return view
    }

    private fun navigateToOtpActivity() {
        // Create an intent to start the OTP activity
        val intent = Intent(requireActivity(), OTPActivity::class.java)
        startActivity(intent)  // Start the OTP activity
    }
}
