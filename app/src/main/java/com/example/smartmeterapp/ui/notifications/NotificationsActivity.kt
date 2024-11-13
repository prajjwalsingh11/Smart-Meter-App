package com.example.smartmeterapp.ui.notifications

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.smartmeterapp.databinding.ActivityNotificationsBinding

class NotificationsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNotificationsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example notifications list
        val notifications = listOf(
            Notification("Title 1", "Short description 1", "2022-12-01"),
            Notification("Title 2", "Short description 2", "2022-12-02"),
            Notification("Title 3", "Short description 3", "2022-12-03")
        )

        // Set adapter for RecyclerView (notifications)
        val adapter = NotificationAdapter(notifications)
        binding.notificationsRecyclerView.adapter = adapter
    }
}
