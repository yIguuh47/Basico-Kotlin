package com.example.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var texto : TextView
    lateinit var seekBar : SeekBar
    lateinit var botao : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.valorAtual)
        seekBar = findViewById(R.id.seekBar)
        botao = findViewById(R.id.button)

        seekBar.setOnSeekBarChangeListener(object :  SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {//esta arrastando
                texto.text = "" + progress
            }

            override fun onStartTrackingTouch(seekBar1: SeekBar?) {//começo a arrasstar
                Toast.makeText(applicationContext, "Começo!!"+seekBar.progress
                        , Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(seekBar1: SeekBar?) {//parou de arrastarr
                Toast.makeText(applicationContext, "Terminou!!"+seekBar.progress , Toast.LENGTH_SHORT).show()
            }

        })
        botao.setOnClickListener{
            Toast.makeText(applicationContext, "Valor Atual? "+seekBar.progress
                    , Toast.LENGTH_SHORT).show()
        }
    }
}