package com.jaimesalebe.twitter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.Theme_Twitter)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        textSingup.setOnClickListener {
            startActivity(Intent(this, SingupActivity::class.java))
        }
        }
    }

