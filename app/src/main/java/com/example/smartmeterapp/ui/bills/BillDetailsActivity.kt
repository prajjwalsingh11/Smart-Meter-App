package com.example.smartmeterapp.ui.bills

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.smartmeterapp.databinding.ActivityBillDetailsBinding

class BillDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBillDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBillDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set bill details
        val billAmount = "100.00"
        val dueDate = "2022-12-31"
        val billingPeriod = "Nov 2022"

        binding.billPeriodTextView.text = "Bill for $billingPeriod"
        binding.amountDueTextView.text = "Amount Due: $$billAmount"
        binding.dueDateTextView.text = "Due Date: $dueDate"

        // Bill breakdown
        binding.breakdownTextView.text = "Electricity Usage: $$50.00\nOther Charges: $$50.00"

        // Handle Download Bill button click
        binding.downloadBillButton.setOnClickListener {
            // Implement logic to download bill
        }

        // Handle Pay Bill button click
        binding.payBillButton.setOnClickListener {
            // Implement logic to pay bill
        }
    }
}
