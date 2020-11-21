package com.example.kotlin_lesson_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sumTextView = findViewById<TextView>(R.id.sumTextView).apply {
            text = intent.getIntExtra(EXTRA_VAL, 12).toString()
        }

        val button = findViewById<Button>(R.id.button).setOnClickListener{
            val inputTextView = findViewById<TextView>(R.id.inputTextView)
            val inputValue = inputTextView.text.toString().toInt()
            SUM += inputValue
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra(EXTRA_VAL, SUM)
            }
            startActivity(intent)
        }
    }
}