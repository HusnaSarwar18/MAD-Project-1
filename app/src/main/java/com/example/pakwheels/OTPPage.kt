package com.example.pakwheels

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class OtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otppage)

        val otpDigit1 = findViewById<EditText>(R.id.otp_digit1)
        val otpDigit2 = findViewById<EditText>(R.id.otp_digit2)
        val otpDigit3 = findViewById<EditText>(R.id.otp_digit3)
        val otpDigit4 = findViewById<EditText>(R.id.otp_digit4)
        val otpDigit5 = findViewById<EditText>(R.id.otp_digit5)
        val otpDigit6 = findViewById<EditText>(R.id.otp_digit6)
        val verifyButton = findViewById<Button>(R.id.verifyButton)
        val resendOtp = findViewById<TextView>(R.id.resendOtp)

        verifyButton.setOnClickListener {
            val otp = otpDigit1.text.toString() + otpDigit2.text.toString() +
                    otpDigit3.text.toString() + otpDigit4.text.toString() +
                    otpDigit5.text.toString() + otpDigit6.text.toString()

            if (otp.length == 6) {
                // Handle OTP verification logic
                Toast.makeText(this, "OTP Verified: $otp", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter a valid 6-digit OTP", Toast.LENGTH_SHORT).show()
            }
        }

        resendOtp.setOnClickListener {
            // Handle resend OTP logic
            Toast.makeText(this, "OTP resent", Toast.LENGTH_SHORT).show()
        }
    }
}
