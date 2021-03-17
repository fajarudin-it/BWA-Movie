package com.bagicode.bwamovie.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bagicode.bwamovie.R
import com.bagicode.bwamovie.home.HomeActivity
import kotlinx.android.synthetic.main.activity_topup_success.*

class TopupSuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topup_success)

        btn_home.setOnClickListener {
            finishAffinity()

            val intent = Intent(this@TopupSuccessActivity,
                HomeActivity::class.java)
            startActivity(intent)
        }

    }
}
