package com.example.simplewebviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class EquityActivity : AppCompatActivity() {
    private lateinit var myEquity: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equity)
        myEquity=findViewById(R.id.myeqiuty)


        val webSettings=myEquity.settings
        webSettings.javaScriptEnabled=true
        myEquity.loadUrl("https://familybank.co.ke/")}
}