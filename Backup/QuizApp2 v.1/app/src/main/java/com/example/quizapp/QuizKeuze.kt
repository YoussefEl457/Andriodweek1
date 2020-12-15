package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class QuizKeuze : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_keuze)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val button: Button = findViewById(R.id.back)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val muziek: ImageButton = findViewById(R.id.music)
        muziek.setOnClickListener {
            val intent = Intent(this, MuziekQuiz::class.java)
            startActivity(intent)
            finish()
        }

        val games: ImageButton = findViewById(R.id.games)
        games.setOnClickListener {
            val intent = Intent(this, GamesQuiz::class.java)
            startActivity(intent)
            finish()
        }

        val geografie: ImageButton = findViewById(R.id.geography)
        geografie.setOnClickListener {
            val intent = Intent(this, GeografieQuiz::class.java)
            startActivity(intent)
            finish()
        }



    }
}