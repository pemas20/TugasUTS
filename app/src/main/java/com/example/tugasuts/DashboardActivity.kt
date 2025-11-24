package com.example.tugasuts

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val username = intent.getStringExtra("USERNAME")
        val email = intent.getStringExtra("EMAIL")
        val firstName = intent.getStringExtra("FIRST_NAME")
        val lastName = intent.getStringExtra("LAST_NAME")

        val usernameTextView = findViewById<TextView>(R.id.textView7)
        val emailTextView = findViewById<TextView>(R.id.textView9)
        val firstNameTextView = findViewById<TextView>(R.id.textView13)
        val lastNameTextView = findViewById<TextView>(R.id.textView15)

        usernameTextView.text = username
        emailTextView.text = email
        firstNameTextView.text = firstName
        lastNameTextView.text = lastName
    }
}