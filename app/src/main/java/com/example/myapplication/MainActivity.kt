package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var  nameEditText : EditText
    lateinit var ageEditText : EditText
    lateinit var nextButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        init()
        listeners()
    }

    private fun init(){
        nameEditText = findViewById(R.id.nameEditText)
        ageEditText = findViewById(R.id.ageEditText)
        nextButton = findViewById(R.id.nextButton)
    }

    private fun listeners(){
        nextButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val age = ageEditText.text.toString().toInt()

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("AGE", age)

            startActivity(intent)

        }
    }
}