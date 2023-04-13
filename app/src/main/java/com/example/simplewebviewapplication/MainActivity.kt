package com.example.simplewebviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnCoop: Button
    private lateinit var btnEquity: Button
    private lateinit var btnFamily: Button
    private lateinit var btnKcb: Button
    private lateinit var btnNational: Button
    private lateinit var btnCall: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}