package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val button: Button = findViewById(R.id.Start_Btn)
        button.setOnClickListener {
           val intent = Intent(this, QuizKeuze::class.java)
           startActivity(intent)
           finish()
        }

    }
}




