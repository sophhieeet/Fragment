package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    lateinit var lastNameEditText : EditText
    lateinit var nextButton2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        init()
        listeners()
    }

    private fun init(){
        lastNameEditText = findViewById(R.id.lastNameEditText)
        nextButton2 = findViewById(R.id.nextButton2)
    }

    private fun listeners(){

        nextButton2.setOnClickListener {
            val name = intent.getStringExtra("NAME")
            val age = intent.getIntExtra("AGE", 0)
            val lastName = lastNameEditText.text.toString()

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("NAME",name)
            intent.putExtra("AGE", age)
            intent.putExtra("LASTNAME",lastName)
            startActivity(intent)
        }

    }
}