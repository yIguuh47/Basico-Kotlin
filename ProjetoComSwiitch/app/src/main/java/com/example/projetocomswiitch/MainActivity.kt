package com.example.projetocomswiitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    //atributos
    lateinit var texto : TextView
    lateinit var botao : Button
    lateinit var interruptor : Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //instanciamento de atributos
        texto  = findViewById(R.id.statusSwitch)
        botao  = findViewById(R.id.button)
        interruptor  = findViewById(R.id.switch1)

        //duas maneiras de instanciar, com objeto implementando os metodos
        //interruptor.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener{
            //override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {

            //}
        //})

        //ou instancia desta maneira
        interruptor.setOnCheckedChangeListener {
            buttonView, isChecked -> isChecked

            var stats = ""
            if (isChecked){
                stats = "Ligado"
            }else{
                stats = "Desligado"
            }
            texto.text = stats

            botao.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    var stats = ""

                    if (interruptor.isChecked){
                        stats = "Ligado"
                    }else{
                        stats = "Desligado"
                    }
                    Toast.makeText(applicationContext, "Switch está: $stats", Toast.LENGTH_SHORT).show()
                }

            })
        }
    }
}