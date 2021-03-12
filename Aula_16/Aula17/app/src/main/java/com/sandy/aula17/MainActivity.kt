package com.sandy.aula17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaoCalcular.setOnClickListener {
            resultado.text = calcularSoma(edtPrimeiroNumero.text.toString().toIntOrNull(),
            edtSegundoNumero.text.toString().toIntOrNull())
        }
    }

    fun calcularSoma(a: Int?, b: Int?) : String {
        var resultado = ""

        resultado = if(a != null && b != null){
            "O resultado é " + (a + b)
        } else {
            "Insira um valor válido"
        }

        return resultado
    }
}