package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var botao: Button
    lateinit var grupo: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao = findViewById(R.id.button)
        grupo = findViewById(R.id.radioGGrup)

        botao.setOnClickListener{
            if(grupo.checkedRadioButtonId != null ){//o local que não tiver vazil faça..
            verficaRadio(grupo.checkedRadioButtonId)
            }else{
                Toast.makeText(applicationContext, "Nenhuma opção Selecionada!", Toast.LENGTH_SHORT).show()
            }
        }

        grupo.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener{
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                verficaRadio(checkedId)
            }
        })
    }

    private fun verficaRadio(checkedId: Int) {
        var radioSelecionado: RadioButton
        radioSelecionado = findViewById(checkedId)
        Toast.makeText(
            applicationContext,
            "Radio Selecionado ${radioSelecionado.text}",
            Toast.LENGTH_SHORT
        ).show()
    }
}