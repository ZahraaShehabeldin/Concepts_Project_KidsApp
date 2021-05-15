package com.example.kidsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        buttonRegister.setOnClickListener {
            if (emailAddressRegister.text.trim().isNotEmpty() || passwordRegister.text.isNotEmpty() || confirmPasswordRegister.text.isNotEmpty())
                Toast.makeText(this, "Please fill the required fields", Toast.LENGTH_SHORT).show()

            else
                Toast.makeText(this, "${emailAddressRegister.text} is registered in", Toast.LENGTH_SHORT).show()

        }
        kidsAppLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent);
        }
    }
}