package com.jaimesalebe.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_gifs.*

class GifsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gifs)

        val name = intent.getStringExtra("name")
        Toast.makeText(applicationContext, "Bienvenido"+" "+name, Toast.LENGTH_LONG).show()

        imageView2.setOnClickListener{
            Toast.makeText(applicationContext, "Gif: Confused", Toast.LENGTH_SHORT).show()
        }

        imageView5.setOnClickListener{
            Toast.makeText(applicationContext, "Gif: Confused 2", Toast.LENGTH_SHORT).show()
        }
        imageView6.setOnClickListener{
            Toast.makeText(applicationContext, "Gif: Confused 3", Toast.LENGTH_SHORT).show()
        }
        imageView7.setOnClickListener{
            Toast.makeText(applicationContext, "Gif: Confused 4", Toast.LENGTH_SHORT).show()
        }
        imageView8.setOnClickListener{
            Toast.makeText(applicationContext, "Gif: Confused 5", Toast.LENGTH_SHORT).show()
        }
        imageView9.setOnClickListener{
            Toast.makeText(applicationContext, "Gif: Confused 6", Toast.LENGTH_SHORT).show()
                }
    }
}