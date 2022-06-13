package com.leo.testestrainning

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setScreen()
    }

    private fun setScreen() {
        val magicNumber = findViewById<TextView>(R.id.tvTitle)
        val button = findViewById<Button>(R.id.button)

        viewModel.valueLiveData.observe(this) { value ->
            magicNumber.text = value.toString()
        }

        button.setOnClickListener {
            viewModel.increase()
        }
    }
}