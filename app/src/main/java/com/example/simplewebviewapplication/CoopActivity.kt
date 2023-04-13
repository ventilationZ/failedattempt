package com.example.simplewebviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class CoopActivity : AppCompatActivity() {
    private lateinit var myCoop: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coop)
        myCoop=findViewById(R.id.mycoop)


        val webSettings=myCoop.settings
        webSettings.javaScriptEnabled=true
        myCoop.loadUrl("https://familybank.co.ke/")}
    }
