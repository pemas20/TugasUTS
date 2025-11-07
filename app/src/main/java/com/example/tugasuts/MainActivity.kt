package com.example.tugasuts

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editUsername = findViewById<EditText>(R.id.editEmail)
        val editEmail = findViewById<EditText>(R.id.editEmail2)
        val editFirstName = findViewById<EditText>(R.id.editFirstName)
        val editLastName = findViewById<EditText>(R.id.editLastName)
        val editPassword = findViewById<EditText>(R.id.editPassword)
        val editPassword2 = findViewById<EditText>(R.id.editPassword2)
        val btnKirim = findViewById<Button>(R.id.btnCancel)
        val btnBatal = findViewById<Button>(R.id.btnSubmit)

        btnKirim.setOnClickListener {
            val username = editUsername.text.toString()
            val email = editEmail.text.toString()
            val firstName = editFirstName.text.toString()
            val lastName = editLastName.text.toString()
            val password = editPassword.text.toString()
            val password2 = editPassword2.text.toString()

            var isValid = true

            if (username.isEmpty()) {
                editUsername.error = "kolom wajib diisi"
                isValid = false
            }
            if (email.isEmpty()) {
                editEmail.error = "kolom wajib diisi"
                isValid = false
            }
            if (firstName.isEmpty()) {
                editFirstName.error = "kolom wajib diisi"
                isValid = false
            }
            if (lastName.isEmpty()) {
                editLastName.error = "kolom wajib diisi"
                isValid = false
            }
            if (password.isEmpty()) {
                editPassword.error = "kolom wajib diisi"
                isValid = false
            }
            if (password2.isEmpty()) {
                editPassword2.error = "kolom wajib diisi"
                isValid = false
            }
            if (password != password2) {
                editPassword2.error = "Password tidak cocok"
                isValid = false
            }

            if (isValid) {
                Toast.makeText(this, "Pendaftaran berhasil", Toast.LENGTH_SHORT).show()
            }
        }

        btnBatal.setOnClickListener {
            editUsername.text.clear()
            editEmail.text.clear()
            editFirstName.text.clear()
            editLastName.text.clear()
            editPassword.text.clear()
            editPassword2.text.clear()
        }
    }
}