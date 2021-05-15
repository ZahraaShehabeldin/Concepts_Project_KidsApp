package com.example.kidsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLogin.setOnClickListener{
            if(emailAddressLogin.text.isNullOrBlank() && emailAddressLogin.text.isNullOrBlank())
            {
                Toast.makeText(this, "Please fill the required fields", Toast.LENGTH_SHORT).show()
                val choose = Intent(this,SelectgameActivity::class.java)
                startActivity(choose)
            }
            else
            {
                Toast.makeText(this, "${emailAddressLogin.text} is logged in", Toast.LENGTH_SHORT).show()
            }
        }

        kidsAppRegister.setOnClickListener{
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
         }
    }
}