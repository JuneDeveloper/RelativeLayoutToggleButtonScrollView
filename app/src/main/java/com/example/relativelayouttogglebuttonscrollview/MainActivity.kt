package com.example.relativelayouttogglebuttonscrollview

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CompoundButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var buttonBTN:Button
    private lateinit var textOutputTV:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonBTN = findViewById(R.id.buttonBTN)
        textOutputTV = findViewById(R.id.textOutputTV)

    }

    fun onClick(view: View) {
        textOutputTV.append(loadBook(text).toString())
    }

    private fun loadBook(text: String): List<String> {
        val list = mutableListOf<String>()
        val x = text.split(' ')
        for (i in x.filter { it.length > 4} ) list += i
        return list
    }
}
