package com.sandy.buscarcep.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.sandy.buscarcep.R
import com.sandy.buscarcep.model.CEP
import androidx.lifecycle.Observer
import com.sandy.buscarcep.model.StateError
import com.sandy.buscarcep.model.StateResponse
import com.sandy.buscarcep.model.StateSuccess

class MainActivity : AppCompatActivity() {

    private lateinit var campoCEP: EditText
    private lateinit var botaoCEP: Button
    private lateinit var respostaCEP: TextView

    private val viewModel = MainActivityViewModel()

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
            if (cep.isNotEmpty()) {
                buscarCEP(cep)
            } else {
                campoCEP.error = "Digite um CEP válido"
            }
        }
    }

    fun buscarCEP(cep: String) {
        viewModel.buscarCEP(cep).observe(this,
            object : Observer<StateResponse<CEP>>{

                override fun onChanged(t: StateResponse<CEP>?) {
                    t?.let{
                        //as (cast)
                        when(t){
                            //is para verificação de classes
                            is StateSuccess -> respostaCEP.text = t.data.toString()
                            is StateError -> respostaCEP.text = "Opa, aconteceu alguma coisa!"
                        }
                    }
                }

            }
        )
    }

}