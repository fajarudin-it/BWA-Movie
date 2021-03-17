package com.bagicode.bwamovie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.bagicode.bwamovie.onboarding.OnboardingOneActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@SplashScreenActivity,
                OnboardingOneActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}
