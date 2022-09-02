package com.example.mobilewallet.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.mobilewallet.R

class LoadMoneyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_money)

        val loadback= findViewById<ImageView>(R.id.loadBack)
        loadback.setOnClickListener {
            startActivity(Intent(this@LoadMoneyActivity,DashboardActivity::class.java))
        }
        val mobile= findViewById<View>(R.id.mobileBanking)
        mobile.setOnClickListener {
            Toast.makeText(this,"Clicked on Mobile Banking", Toast.LENGTH_SHORT).show()
        }
        val internet= findViewById<View>(R.id.internetBanking)
        internet.setOnClickListener {
            Toast.makeText(this,"Clicked on Internet Banking", Toast.LENGTH_SHORT).show()
        }
        val card= findViewById<View>(R.id.cardBanking)
        card.setOnClickListener {
            Toast.makeText(this,"Clicked on Card Banking", Toast.LENGTH_SHORT).show()
        }
    }
}