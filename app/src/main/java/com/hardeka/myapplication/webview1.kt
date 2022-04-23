package com.hardeka.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class webview1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview1)

        val myWebView: WebView = findViewById(R.id.webviewlocal1)
        myWebView.settings.loadsImagesAutomatically
        myWebView.settings.javaScriptEnabled

        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("https://192.168.205.2/cat/login.php")


    }
}