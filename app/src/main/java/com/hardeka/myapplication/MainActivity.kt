package com.hardeka.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toolbar
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnonline = findViewById<Button>(R.id.btnonline1)
        btnonline.setOnClickListener {
            val Intent = Intent(this, webviewonline::class.java)
            startActivity(Intent)
        }
        val btnlocal1servers = findViewById<Button>(R.id.btnlocal1server)
        btnlocal1servers.setOnClickListener {
            val Intent = Intent(this, webview1::class.java)
            startActivity(Intent)
        }
        val btnlocal2servers = findViewById<Button>(R.id.btnlocal2server)
        btnlocal2servers.setOnClickListener {
            val Intent = Intent(this, webview2::class.java)
            startActivity(Intent)
        }
        val btnlocal3servers = findViewById<Button>(R.id.btnlocal3server)
        btnlocal3servers.setOnClickListener {
            val Intent = Intent(this, webview3::class.java)
            startActivity(Intent)
        }
        val btntutor = findViewById<Button>(R.id.tutoBtn)
        btntutor.setOnClickListener {
            val Intent = Intent(this, Tutorial::class.java)
            startActivity(Intent)
        }
        val exitBt: Button = findViewById(R.id.exitBtn)
        exitBt.setOnClickListener {
            val alertDialog : AlertDialog = AlertDialog.Builder(this).create()
            alertDialog.setTitle("Exit")
            alertDialog.setMessage("Apakah anda yakin?")

            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes") {
                    dialog, which -> finish()
                    dialog.dismiss() }

            alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "No") {
                    dialog, which ->
                    dialog.dismiss() }
            alertDialog.show()
        }
        val btnlocal4servers = findViewById<Button>(R.id.btnlocal4server)
        btnlocal4servers.setOnClickListener {
            val Intent = Intent(this, webview4::class.java)
            startActivity(Intent)
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_aboutmee -> {
                this.startActivity(Intent(this@MainActivity, About::class.java))
            }
        }
    }
}
