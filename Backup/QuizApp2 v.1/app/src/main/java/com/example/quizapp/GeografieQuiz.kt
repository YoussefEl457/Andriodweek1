package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import androidx.core.widget.TintableCompoundDrawablesView

class GeografieQuiz : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionList: ArrayList<vragenLayout>? = null
    private var mSelectedOptionPosition:Int = 0
    private var mCorrecteOptiePunt: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games_quiz)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        mQuestionList = GamesConstants.getQuestions()


        setQuestions()

        val optie1: TextView = findViewById(R.id.optie1)
        val optie2: TextView = findViewById(R.id.optie2)
        val optie3: TextView = findViewById(R.id.optie3)
        val volgende: Button = findViewById(R.id.volgende_vraag)

        optie1.setOnClickListener(this)
        optie2.setOnClickListener(this)
        optie3.setOnClickListener(this)
        volgende.setOnClickListener(this)

    }
    private fun setQuestions(){
        defaultOptionsView()

        if(mCurrentPosition == mQuestionList!!.size){
            val volgende: Button = findViewById(R.id.volgende_vraag)
            volgende.text = "Klaar"
        }else {
            val volgende: Button = findViewById(R.id.volgende_vraag)
            volgende.text = "Volgende"
        }


        val question = mQuestionList!![mCurrentPosition -1]

        val progressBar: ProgressBar = findViewById(R.id.progressBar)
        val progress: TextView = findViewById(R.id.progress)
        val muziekVraag: TextView = findViewById(R.id.muziek_vraag)
        val optie1: TextView = findViewById(R.id.optie1)
        val optie2: TextView = findViewById(R.id.optie2)
        val optie3: TextView = findViewById(R.id.optie3)

        progressBar.progress = mCurrentPosition
        progress.text = "$mCurrentPosition" + "/" + progressBar.max
        muziekVraag.text = question!!.quizVraag
        optie1.text = question.optieÉén
        optie2.text = question.optieTwee
        optie3.text = question.optieDrie
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        val optie1: TextView = findViewById(R.id.optie1)
        val optie2: TextView = findViewById(R.id.optie2)
        val optie3: TextView = findViewById(R.id.optie3)
        options.add(0, optie1)
        options.add(1, optie2)
        options.add(2, optie3)

        for (option in options){
            option.setTextColor(Color.parseColor("#ffffff"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.optie_border)
        }
    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.optie1 ->{
                val optie1: TextView = findViewById(R.id.optie1)
                selectedOptionView(optie1, 1)
            }

            R.id.optie2 ->{
                val optie2: TextView = findViewById(R.id.optie2)
                selectedOptionView(optie2, 2)
            }

            R.id.optie3 ->{
                val optie3: TextView = findViewById(R.id.optie3)
                selectedOptionView(optie3, 3)
            }

            R.id.volgende_vraag ->{
                val volgende: Button = findViewById(R.id.volgende_vraag)
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition++

                    when{
                        mCurrentPosition <= mQuestionList!!.size ->{
                            setQuestions()
                        }else ->{
                            val intent = Intent(this, QuizUitslag::class.java)
                            intent.putExtra(Constants.CORRECTE_ANTWOORDEN, mCorrecteOptiePunt)
                            intent.putExtra(Constants.ALLE_VRAGEN, mQuestionList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                }else{
                    val vraag = mQuestionList?.get(mCurrentPosition -1)
                    if (vraag!!.correcteAntwoord != mSelectedOptionPosition){
                        antwoordCheck(mSelectedOptionPosition, R.drawable.incorrecte_optie_border)
                    }else{
                        mCorrecteOptiePunt++
                    }
                    antwoordCheck(vraag.correcteAntwoord, R.drawable.correcte_optie_border)

                    if(mCurrentPosition == mQuestionList!!.size){
                        val volgende: Button = findViewById(R.id.volgende_vraag)
                        volgende.text = "Klaar"
                    }else{
                        val volgende: Button = findViewById(R.id.volgende_vraag)
                        volgende.text = "Volgende vraag"
                    }
                    mSelectedOptionPosition = 0
                }

            }

        }

    }
    private fun antwoordCheck (antwoord: Int, drawablesView: Int){
        when(antwoord){
            1 ->{
                val optie1: TextView = findViewById(R.id.optie1)
                optie1.background = ContextCompat.getDrawable(this, drawablesView)
            }

            2 ->{
                val optie2: TextView = findViewById(R.id.optie2)
                optie2.background = ContextCompat.getDrawable(this, drawablesView)
            }

            3 ->{
                val optie3: TextView = findViewById(R.id.optie3)
                optie3.background = ContextCompat.getDrawable(this, drawablesView)
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#000000"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.geselecteerde_optie_border)
    }
}