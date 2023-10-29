package com.albin.primerapp.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.albin.primerapp.R

class FirstAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnStar = findViewById<AppCompatButton>(R.id.btnStar)
        val etName = findViewById<AppCompatEditText>(R.id.etName)



        btnStar.setOnClickListener{
            val name = etName.text.toString()
            if (name.isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }

        }
        //Al arrancar la app, se ejecuta el método onCreate
    }
}