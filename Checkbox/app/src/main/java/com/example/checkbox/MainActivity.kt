package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var checkBox: CheckBox
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textView)
        checkBox = findViewById(R.id.checkBox)
        button = findViewById(R.id.button)

//        checkBox.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener{
//            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
//                var textoExibir = ""
//                if (isChecked){
//                    textoExibir = "Marcado"
//                }else{
//                    textoExibir = "Desmarcado"
//                }
//                Toast.makeText(applicationContext, textoExibir, Toast.LENGTH_SHORT).show()
//                texto.text = textoExibir
//            }
//        })

        //AMBOS CODIGOS FAZEM A MESMA COISA

        checkBox.setOnCheckedChangeListener{
            buttonView, isChecked -> isChecked

            var textoExibir = status(isChecked)//cria um objeto txtexibir e instancia check

            Toast.makeText(applicationContext, textoExibir, Toast.LENGTH_SHORT).show()
            texto.text = textoExibir
    }
        
        button.setOnClickListener{
            Toast.makeText(applicationContext, "", Toast.LENGTH_SHORT).show()
        }
        
    }

    private fun status(isChecked: Boolean): String {//metodo de estatus da checkbox, instancia ischeck
        var textoExibir = ""
        if (isChecked) {
            textoExibir = "Marcado"
        } else {
            textoExibir = "Desmarcado"
        }
        return textoExibir
    }
}