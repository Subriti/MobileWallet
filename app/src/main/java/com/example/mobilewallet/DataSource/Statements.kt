package com.example.mobilewallet.DataSource

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.mobilewallet.Model.Transactions
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Statements {
    @RequiresApi(Build.VERSION_CODES.O)
    val current: LocalDateTime = LocalDateTime.now()
    @RequiresApi(Build.VERSION_CODES.O)
    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    @RequiresApi(Build.VERSION_CODES.O)
    val formatted: String = current.format(formatter)

    @RequiresApi(Build.VERSION_CODES.O)
    fun loadTransactions(): List<Transactions> {
        return listOf<Transactions>(
            Transactions("Topup for NTC -9843346520",formatted,100,"Balance: 1036.12"),
            Transactions("Topup for NTC -9843346520",formatted,150,"Balance: 1036.12"),
            Transactions("Topup for NTC -9843346520",formatted,100,"Balance: 1036.12"),
            Transactions("Topup for NTC -9843346520",formatted,200,"Balance: 1036.12"),
            Transactions("Topup for NTC -9843346520",formatted,50,"Balance: 1036.12"),
            Transactions("Topup for NTC -9843346520",formatted,300,"Balance: 1036.12"),
            Transactions("Topup for NTC -9843346520",formatted,200,"Balance: 1036.12"),
            Transactions("Topup for NTC -9843346520",formatted,50,"Balance: 1036.12"),
            Transactions("Topup for NTC -9843346520",formatted,100,"Balance: 1036.12"),
        )
    }
}
