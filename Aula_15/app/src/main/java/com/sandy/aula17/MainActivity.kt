package com.sandy.aula17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, calcularSoma(1, 5), Toast.LENGTH_LONG)
    }

    fun calcularSoma(a: Int?, b: Int?) : String {
        var resultado = ""
        resultado = if(a == null || b == null){
            "Insira um valor válido"
        } else{
            "O resultado é " + (a + b)
        }

        return resultado
    }
}