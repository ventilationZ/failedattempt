package com.example.simplewebviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class KcbActivity : AppCompatActivity() {
    private lateinit var myKcb: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcb)
        myKcb=findViewById(R.id.mykcb)


        val webSettings=myKcb.settings
        webSettings.javaScriptEnabled=true
        myKcb.loadUrl("https://ke.kcbgroup.com/")
    }
}