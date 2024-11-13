package com.example.smartmeterapp.ui.consumption

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.smartmeterapp.databinding.ActivityConsumptionHistoryBinding

class ConsumptionHistoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConsumptionHistoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConsumptionHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up dropdown for time period
        binding.timePeriodDropdown.setAdapter(
            ArrayAdapter.createFromResource(
                this,
                R.array.time_periods,
                android.R.layout.simple_spinner_dropdown_item
            )
        )

        // Example chart data
        binding.chart.setData(generateChartData())

        // Handle compare button click
        binding.compareButton.setOnClickListener {
            // Compare current vs previous period consumption
        }
    }

    private fun generateChartData(): ChartData {
        // Generate chart data (dummy data in this example)
        return ChartData(listOf(10, 20, 15, 30), listOf("Jan", "Feb", "Mar", "Apr"))
    }
}