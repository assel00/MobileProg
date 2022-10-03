package com.example.project

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

import android.os.Bundle


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val loginText:TextView=findViewById(R.id.textView_login_now)
        loginText.setOnClickListener{
            val intent=Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }
    }
}