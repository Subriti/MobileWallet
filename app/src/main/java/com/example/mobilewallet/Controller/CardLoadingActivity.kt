package com.example.mobilewallet.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.mobilewallet.R

class CardLoadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_loading)

        val loadMoney = findViewById<ImageView>(R.id.loadBack)
        loadMoney.setOnClickListener {
            startActivity(Intent(this, LoadMoneyActivity::class.java))
        }
    }
}