package com.example.smartmeterapp.ui.dashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.smartmeterapp.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Sample data for user
        val userName = "User Name"
        val balance = "50.00"
        val consumption = "15.00"

        binding.userNameTextView.text = "Welcome, $userName"
        binding.balanceTextView.text = "Current Balance: $$balance"
        binding.consumptionTextView.text = "Consumption Today: $consumption kWh"

        // Handle Recharge button click
        binding.rechargeButton.setOnClickListener {
            // Call recharge API or process
        }

        // Handle View Details button click
        binding.viewDetailsButton.setOnClickListener {
            // Navigate to Consumption History or Bill Details screen
        }

        // Handle Notifications button click
        binding.notificationsIcon.setOnClickListener {
            // Open Notifications
        }

        // Handle Support button click
        binding.supportIcon.setOnClickListener {
            // Open customer support screen
        }
    }
}
