package com.example.pr1213

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
    fun onClickStepsActivity(view: View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}