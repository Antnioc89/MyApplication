package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val botao = findViewById<Button>(R.id.button)

        botao.setOnClickListener{

            irParaSegundaTela()

        }


    }

    private fun irParaSegundaTela() {
        val botao1 = Intent(this, MainActivity3::class.java)
        startActivity(botao1)
    }
}