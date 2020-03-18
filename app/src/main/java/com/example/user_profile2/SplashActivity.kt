package com.example.user_profile2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

/**
 * @author Omar Mulla Ibrahim
 * Student Nr 500766035
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            startActivity(
                Intent(this@SplashActivity, CreateProfileActivity::class.java)
            )
            finish()
        }, 1000)
    }
}
