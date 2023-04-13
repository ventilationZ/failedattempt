package com.example.simplewebviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class FamilybActivity : AppCompatActivity() {
    private lateinit var myFamily: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_familyb)
        myFamily=findViewById(R.id.myfamily)


        val webSettings=myFamily.settings
        webSettings.javaScriptEnabled=true
        myFamily.loadUrl("https://familybank.co.ke/")}
}