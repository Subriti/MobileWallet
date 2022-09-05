package com.example.mobilewallet.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.example.mobilewallet.R

class SendMoneyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_money)

        val loadback= findViewById<ImageView>(R.id.loadMoney)
        loadback.setOnClickListener {
            startActivity(Intent(this@SendMoneyActivity,DashboardActivity::class.java))
        }
        val bank= findViewById<View>(R.id.Bank)
        bank.setOnClickListener {
            startActivity(Intent(this, TransferToBankActivity::class.java))
        }
        val user= findViewById<View>(R.id.WalletUsers)
        user.setOnClickListener {
            Toast.makeText(this,"Clicked on Transfer to Wallet Users", Toast.LENGTH_SHORT).show()
            //startActivity(Intent(this, Activity::class.java))
        }
        val corp= findViewById<View>(R.id.Corp)
        corp.setOnClickListener {
            Toast.makeText(this,"Clicked on Transfer to Co-op", Toast.LENGTH_SHORT).show()
            //startActivity(Intent(this, Activity::class.java))
        }
    }
}