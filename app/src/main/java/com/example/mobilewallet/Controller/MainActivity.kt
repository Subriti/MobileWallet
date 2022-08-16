package com.example.mobilewallet.Controller

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilewallet.DataSource.Statements
import com.example.mobilewallet.R
import com.example.mobilewallet.Adapter.RecyclerAdapter

class MainActivity : AppCompatActivity() {
    lateinit var adapter: RecyclerAdapter
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter= RecyclerAdapter(Statements().loadTransactions(), this)
        val recyclerView= findViewById<RecyclerView>(R.id.statementRecyclerView)
        recyclerView.adapter=adapter

        val layoutManager= LinearLayoutManager(this)
        recyclerView.layoutManager= layoutManager
        recyclerView.setHasFixedSize(true)

        val notif= findViewById<ImageView>(R.id.notif)
        notif.setOnClickListener(){
            //Toast.makeText(this, "Clicked on Notifications", Toast.LENGTH_SHORT).show()
            val intent= Intent(this, NotificationActivity:: class.java)
            startActivity(intent)

        }
    }
}