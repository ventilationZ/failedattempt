package com.example.simplewebviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class NationalActivity : AppCompatActivity() {
    private lateinit var myNational: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_familyb)
        myNational=findViewById(R.id.myfamily)


        val webSettings=myNational.settings
        webSettings.javaScriptEnabled=true
        myNational.loadUrl("https://www.nationalbank.co.ke/")}
}