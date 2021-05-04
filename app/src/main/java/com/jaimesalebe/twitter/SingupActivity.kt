package com.jaimesalebe.twitter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_singup.*
import kotlinx.android.synthetic.main.activity_start.*

class SingupActivity : AppCompatActivity() {

    private lateinit var nameSingup: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)

        nameSingup = findViewById(R.id.editTextTextPersonName)

        imageButton.setOnClickListener { finish()}

        textView.setOnClickListener{
            val builder = AlertDialog.Builder(this)


            builder.setTitle("Create account")
            builder.setMessage("¿Do you want create this account?")
            builder.setPositiveButton("Ok"){dialog, which ->
                Toast.makeText(applicationContext,"Created",Toast.LENGTH_SHORT).show()
                intent = Intent(this,LoginActivity::class.java).apply {
                    putExtra("nameSingup",nameSingup.editableText.toString())
                }
                startActivity(intent)

                finish()

            }
            builder.setNegativeButton("Cancel"){dialog, which ->
                dialog.cancel()
            }
            val dialog: AlertDialog = builder.create()

            // Display the alert dialog on app interface


            dialog.show()
        }
    }
}