package com.bagicode.bwamovie.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bagicode.bwamovie.R
import kotlinx.android.synthetic.main.activity_onboarding_tree.*
import com.bagicode.bwamovie.sign.signin.SignInActivity

class OnboardingTreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_tree)

        btn_home.setOnClickListener {
            finishAffinity()

            val intent = Intent(this@OnboardingTreeActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
