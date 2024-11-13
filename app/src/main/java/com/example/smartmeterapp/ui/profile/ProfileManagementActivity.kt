package com.example.smartmeterapp.ui.profile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.smartmeterapp.databinding.ActivityProfileManagementBinding

class ProfileManagementActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileManagementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileManagementBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set default profile data (dummy data)
        binding.usernameEditText.setText("User Name")
        binding.emailEditText.setText("user@example.com")

        // Handle save button click
        binding.saveButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            val email = binding.emailEditText.text.toString()

            // Call ViewModel or Repository to save profile data
        }
    }
}
