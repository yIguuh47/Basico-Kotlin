package com.example.spinner

import android.R.layout.simple_spinner_dropdown_item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var menu: Spinner
    lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textView)
        menu = findViewById(R.id.spinner)
        botao = findViewById(R.id.button)

        var estados = arrayOf("São-Paulo","Parana","Rio de Janeiro","Tocantins","...")
        menu.adapter = ArrayAdapter(this, simple_spinner_dropdown_item, estados)

        menu.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {//se não selecionar nada

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
               texto.text = estados[position]
            }

        }

        botao.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View) {
                var posicaoSelecionada = menu.selectedItemPosition
                Toast.makeText(applicationContext, estados[menu.selectedItemPosition], Toast.LENGTH_SHORT).show()
            }
        })
    }
}