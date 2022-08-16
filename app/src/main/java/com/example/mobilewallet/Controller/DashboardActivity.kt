package com.example.mobilewallet.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.mobilewallet.R

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val notif= findViewById<ImageView>(R.id.notif)
        notif.setOnClickListener(){
            //Toast.makeText(this, "Clicked on Notifications", Toast.LENGTH_SHORT).show()
            val intent= Intent(this, NotificationActivity:: class.java)
            startActivity(intent)
        }

        val statement= findViewById<ImageView>(R.id.transactions)
        statement.setOnClickListener(){
            //Toast.makeText(this, "Clicked on Notifications", Toast.LENGTH_SHORT).show()
            val intent= Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
    }
}