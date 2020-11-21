package com.example.kotlin_lesson_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

var SUM = 0;
val EXTRA_VAL = "com.example.kotlin_lesson_1"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sumTextView = findViewById<TextView>(R.id.sumTextView).apply {
            text = SUM.toString()
        }

        val button = findViewById<Button>(R.id.button).setOnClickListener{
            val inputTextView = findViewById<TextView>(R.id.inputTextView)
            val inputValue = inputTextView.text.toString().toInt()
            SUM += inputValue
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra(EXTRA_VAL, SUM)
            }
            startActivity(intent)
        }
    }
}