package com.fake.navigation

import android.annotation.SuppressLint
import android.net.http.UrlRequest.Status
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.imageview.ShapeableImageView
import org.w3c.dom.Text


class MainActivity2<StatusTextView> : AppCompatActivity() {

    private lateinit var tamagotchiImageView : ImageView
    private var tamagotchiStatusTextView : StatusTextView = TODO()
    private lateinit var tamagotchi : TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

         tamagotchi("Tamagotchi")
        tamagotchiStatusTextView = findViewById(R.id.tamagotchiStatusTextView)
        tamagotchiImageView = findViewById(R.id.tamagotchiImageView)

        findViewById<Button>(R.id.feedButton).setOnClickListener { feedTamagotchi() }
        findViewById<Button>(R.id.playButton).setOnClickListener { playWithTamagotchi() }
        findViewById<Button>(R.id.sleepButton).setOnClickListener { letTamagotchiSleep() }
        findViewById<Button>(R.id.statusButton).setOnClickListener {displayTamagotchiStatus()}

        }

    private fun tamagotchi(s: String) {
        TODO("Not yet implemented")
    }

    private fun displayTamagotchiStatus() {
        TODO("Not yet implemented")
    }

    private fun letTamagotchiSleep() {
        TODO("Not yet implemented")
    }

    private fun playWithTamagotchi() {
        TODO("Not yet implemented")
    }

    private fun feedTamagotchi() {
        TODO("Not yet implemented")
    }


}
