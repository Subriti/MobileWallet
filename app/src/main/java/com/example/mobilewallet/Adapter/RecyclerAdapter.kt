package com.example.mobilewallet.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilewallet.Model.Transactions
import com.example.mobilewallet.R

class RecyclerAdapter(val dataset: List<Transactions>, val context: Context): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.transactionTitle)
        val amount: TextView = itemView.findViewById(R.id.transactionAmount)
        val datetime: TextView = itemView.findViewById(R.id.time)
        val balance: TextView = itemView.findViewById(R.id.balance)

        fun bindTransactions(transactions: Transactions, context: Context){
            title.text= transactions.title
            amount.text= transactions.amount.toString()
            datetime.text= transactions.date
            balance.text= transactions.balance
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view= LayoutInflater.from(context). inflate(R.layout.statement_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item= dataset[position]
        holder.bindTransactions(dataset[position],context)
    }

    override fun getItemCount(): Int {
        return dataset.count()
    }
}