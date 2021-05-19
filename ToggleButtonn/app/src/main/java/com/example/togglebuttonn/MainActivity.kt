package com.example.togglebuttonn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var  interruptor: ToggleButton
    lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textView)
        interruptor = findViewById(R.id.toggleButton)
        botao = findViewById(R.id.button)

        interruptor.setOnCheckedChangeListener{
            buttonView, isChecked -> isChecked

            texto.text = verificaInterruptor(isChecked)//texto ira retornar o resultado da verificação
        }

        botao.setOnClickListener{
            //exibir texto de ischeck
            Toast.makeText(applicationContext, verificaInterruptor(interruptor.isChecked), Toast.LENGTH_SHORT).show()
        }

    }

    private fun verificaInterruptor(isChecked: Boolean) :String {
        var textoExibidor = ""
        if (isChecked) {
            textoExibidor = "Ligado"
        } else {
            textoExibidor = "Desligado"
        }
        return  textoExibidor
    }
}