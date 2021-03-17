package com.bagicode.bwamovie.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.bagicode.bwamovie.R
import kotlinx.android.synthetic.main.activity_wallet_top_up.*

class WalletTopUpActivity : AppCompatActivity() {

    private var status15k : Boolean = false
    private var status30k : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet_top_up)

        btn_top_up.setOnClickListener {
            startActivity(Intent(this, TopupSuccessActivity::class.java))
        }

        tv_15k.setOnClickListener {
            if (status15k) {
                deselectMoney(tv_15k)
            } else {
                selectMoney(tv_15k)
            }
        }

        tv_30k.setOnClickListener {
            if (status30k) {
                deselectMoney(tv_30k)
            } else {
                selectMoney(tv_30k)
            }
        }

        iv_back.setOnClickListener {
            finish()
        }
    }

    private fun selectMoney(textView:TextView) {
        textView.setTextColor(resources.getColor(R.color.colorPink))
        textView.setBackgroundResource((R.drawable.shape_line_pink))
        status15k = true
        status30k = true

        btn_top_up.visibility = View.VISIBLE
    }

    private fun deselectMoney(textView:TextView) {
        textView.setTextColor(resources.getColor(R.color.colorWhite))
        textView.setBackgroundResource((R.drawable.shape_line_white))
        status15k = false
        status30k = false

        btn_top_up.visibility = View.INVISIBLE
    }
}
