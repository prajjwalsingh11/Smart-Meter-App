package com.example.smartmeterapp.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.smartmeterapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Handle login button click
        binding.loginButton.setOnClickListener {
            val email = binding.emailEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            // Call ViewModel or Repository for login logic
            // Assuming ViewModel is properly set up, perform login here
        }

        // Handle forgot password
        binding.forgotPasswordLink.setOnClickListener {
            // Navigate to Forgot Password screen
        }

        // Handle new user registration
        binding.signUpLink.setOnClickListener {
            // Navigate to Sign Up screen
        }
    }
}
