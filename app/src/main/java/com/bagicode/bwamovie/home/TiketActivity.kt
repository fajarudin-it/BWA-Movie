package com.bagicode.bwamovie.home

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.bagicode.bwamovie.checkout.model.Checkout
import com.bagicode.bwamovie.R
import com.bagicode.bwamovie.home.model.Film
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_popup.view.*
import kotlinx.android.synthetic.main.activity_tiket.*
import kotlinx.android.synthetic.main.activity_tiket.iv_back
import kotlinx.android.synthetic.main.activity_tiket.tv_genre
import kotlinx.android.synthetic.main.activity_tiket.tv_rate

@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class TiketActivity : AppCompatActivity() {

    private var dataList = ArrayList<Checkout>()

    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiket)

        val data = intent.getParcelableExtra<Film>("data")

        tv_title.text = data.judul
        tv_genre.text = data.genre
        tv_rate.text = data.rating

        Glide.with(this)
            .load(data.poster)
            .into(iv_poster_image)

        rc_checkout.layoutManager = LinearLayoutManager(this)
        dataList.add(Checkout("A3",""))
        dataList.add(Checkout("A4",""))

        rc_checkout.adapter = TiketAdapter(dataList) {
        }

        iv_back.setOnClickListener {
            finish()
        }

        img_popup.setOnClickListener {
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_popup, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogView)
            val mAlertDialog = mBuilder.show()
            mDialogView.btn_ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }

    }
}
