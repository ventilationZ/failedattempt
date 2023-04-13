package com.example.simplewebviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class TrustActivity : AppCompatActivity() {
    private lateinit var myTrust: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trust)
        myTrust=findViewById(R.id.mytrust)


        val webSettings=myTrust.settings
        webSettings.javaScriptEnabled=true
        myTrust.loadUrl("https://dtbk.dtbafrica.com/")}
    }
