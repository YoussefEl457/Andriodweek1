package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class QuizUitslag : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_uitslag)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val alleVragen = intent.getIntExtra(Constants.ALLE_VRAGEN, 0)
        val correcteAntwoorden = intent.getIntExtra(Constants.CORRECTE_ANTWOORDEN, 0)

        val score: TextView = findViewById(R.id.score)
        score.text = "$correcteAntwoorden / $alleVragen"

        val finish: Button = findViewById(R.id.quiz_finish)
        finish.setOnClickListener {
            val intent = Intent(this, QuizKeuze::class.java)
            startActivity(intent)
            finish()
        }
    }
}