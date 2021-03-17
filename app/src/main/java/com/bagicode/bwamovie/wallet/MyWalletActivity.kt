package com.bagicode.bwamovie.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bagicode.bwamovie.R
import com.bagicode.bwamovie.wallet.adapter.WalletAdapter
import com.bagicode.bwamovie.wallet.model.Wallet
import kotlinx.android.synthetic.main.activity_my_wallet.*

class MyWalletActivity : AppCompatActivity() {

    private var dataList = ArrayList<Wallet>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_wallet)

        dataList.add(
            Wallet(
                "Avengers Return",
                "Sabtu, 26 juli 2020",
                70000.0,
                "0"
                )
        )
        dataList.add(
            Wallet(
                "Top Up",
                "Sabtu, 26 juli 2020",
                1700000.0,
                "1"
            )
        )
        dataList.add(
            Wallet(
                "Avengers Return",
                "Sabtu, 26 juli 2020",
                700000.0,
                "0"
            )
        )

        rv_transaksi.layoutManager = LinearLayoutManager(this)
        rv_transaksi.adapter = WalletAdapter(dataList){

        }

        btn_top_up.setOnClickListener {
            startActivity(Intent(this, WalletTopUpActivity::class.java))
        }

        iv_back.setOnClickListener {
            finish()
        }
    }
}
