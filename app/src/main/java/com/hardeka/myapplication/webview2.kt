package com.hardeka.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class webview2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview2)

        val myWebView: WebView = findViewById(R.id.webviewlocal2)
        myWebView.settings.loadsImagesAutomatically
        myWebView.settings.javaScriptEnabled

        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("https://192.168.205.3/cat/login.php")


    }
}