package com.example.frasesdecoach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.buttonFrase)
        button.setOnClickListener(View.OnClickListener {
            gerar(button)
        })
    }

    fun gerar(view: View){
        val sorteado = Random.nextInt(0,10 )
        val frases =resources.getTextArray(R.array.frases)
        var textView = findViewById<TextView>(R.id.textFrase)
        textView.text= frases[sorteado]

    }
}