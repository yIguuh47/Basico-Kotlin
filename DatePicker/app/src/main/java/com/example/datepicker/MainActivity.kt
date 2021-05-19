package com.example.datepicker


import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {

    var cal = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dateSetListener = object : DatePickerDialog.OnDateSetListener{
            override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
                cal.set(Calendar.YEAR, year)//pega ano
                cal.set(Calendar.MONTH, month)//pega mes
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)//pega dia do mes

                val formatoDeData = "dd/MM/yyyy"
                val formatador = SimpleDateFormat(formatoDeData, Locale.ITALY)
                
                //data!!.text = formatoDeData.format(cal.time)
            }

        }

    }
}