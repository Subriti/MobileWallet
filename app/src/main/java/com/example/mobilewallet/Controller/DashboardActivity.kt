package com.example.mobilewallet.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.mobilewallet.R

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val notif = findViewById<ImageView>(R.id.download)
        notif.setOnClickListener {
            //Toast.makeText(this, "Clicked on Notifications", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }

        val statement = findViewById<ImageView>(R.id.transactions)
        statement.setOnClickListener {
            //Toast.makeText(this, "Clicked on Notifications", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val scan = findViewById<ImageView>(R.id.scanAndPay)
        scan.setOnClickListener {
            val intent = Intent(this, ScanActivity::class.java)
            startActivity(intent)
        }
    }
}