package com.sandy.buscarcep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var campoCEP: EditText
    private lateinit var botaoCEP: Button
    private lateinit var respostaCEP: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Arquivo gerado de XML total
        //R.java
        campoCEP = findViewById(R.id.edtCEP)
        botaoCEP = findViewById(R.id.btnBuscarCEP)
        respostaCEP = findViewById(R.id.txtCEPResponse)

        botaoCEP.setOnClickListener {
            val cep = campoCEP.text.toString()
            if(cep.isNotEmpty()){
                buscarCEP(cep)
            } else {
                campoCEP.error = "Digite um CEP válido"
            }
        }
    }

    fun buscarCEP(cep: String){
        //Iniciar requisição a API para buscar CEP
        val retrofitClient = Network.RetrofitConfig("https://viacep.com.br/ws/")
    }
}