package com.jaimesalebe.twitter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.imageButton
import kotlinx.android.synthetic.main.activity_singup.*

class LoginActivity : AppCompatActivity() {

    private lateinit var name:EditText
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val nameSingup = intent.getStringExtra("nameSingup")
        name = findViewById(R.id.editTextTextPersonName)
        name.setText(nameSingup).toString()

        btnSingup.setOnClickListener {
            startActivity(Intent(this, SingupActivity::class.java))
        }

        imageButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        textLogin1.setOnClickListener {
            intent = Intent(this,GifsActivity::class.java).apply {
                putExtra("name",name.editableText.toString())
            }

            startActivity(intent)
        }


    }
}