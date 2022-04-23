package com.hardeka.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class webviewonline : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webviewonline)

        val myWebView: WebView = findViewById(R.id.webviewonline1)
        myWebView.settings.loadsImagesAutomatically
        myWebView.settings.javaScriptEnabled

        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("https://smkpabhara.sch.id/cat/login.php")


    }

}