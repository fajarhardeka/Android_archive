package com.hardeka.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Tutorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        val actionBar = supportActionBar
        actionBar!!.title = "Tutorial"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}