package com.example.agroexpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val spinner : Spinner =  findViewById(R.id.spinner)
    }
}