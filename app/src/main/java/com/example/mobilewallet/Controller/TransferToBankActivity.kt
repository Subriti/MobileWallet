package com.example.mobilewallet.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.mobilewallet.R

class TransferToBankActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transfer_to_bank)

        val loadback= findViewById<ImageView>(R.id.loadMoney)
        loadback.setOnClickListener {
            startActivity(Intent(this@TransferToBankActivity,SendMoneyActivity::class.java))
        }
    }
}