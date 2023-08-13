package com.example.domainknowledge

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen2)

        val android1 = findViewById<CardView>(R.id.android)
        val web1 = findViewById<CardView>(R.id.web)
        val machine1 = findViewById<CardView>(R.id.machine)
        val cyber = findViewById<CardView>(R.id.cyber)
        val ar = findViewById<CardView>(R.id.ar)
        val data = findViewById<CardView>(R.id.data)
        val Phone = findViewById<Button>(R.id.call)



        android1.setOnClickListener(){
            intent = Intent(applicationContext,android :: class.java)
            startActivity(intent)
        }
        web1.setOnClickListener() {
            intent = Intent(applicationContext, web::class.java)
            startActivity(intent)
        }
        machine1.setOnClickListener(){
            intent = Intent(applicationContext,Machine :: class.java)
            startActivity(intent)
        }
        cyber.setOnClickListener(){
            intent = Intent(applicationContext,Cyber :: class.java)
            startActivity(intent)
        }
        ar.setOnClickListener(){
           intent = Intent(applicationContext,ARVR :: class.java)
            startActivity(intent)
        }
        data.setOnClickListener(){
            intent = Intent(applicationContext,Data :: class.java)
            startActivity(intent)
        }
        Phone.setOnClickListener(){
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:" + 8791568844) //change the number.

            startActivity(callIntent)
        }
    }
}