package com.sandy.buscarcep.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sandy.buscarcep.model.CEP
import com.sandy.buscarcep.model.StateResponse
import com.sandy.buscarcep.repository.CEPRemoteRepository

//RESPONSÁVEL PELA PARTE DA REGRA DE NEGÓCIO QUE CONECTA
//A INTERAÇÃO DO USUÁRIO COM A CAMADA DE COMUNICAÇÃO (REPOSITÓRIO)
//RETORNANDO O VALOR A ACTIVITY
class MainActivityViewModel(
    private val cepRemoteRepository: CEPRemoteRepository = CEPRemoteRepository()
) : ViewModel(){

    private lateinit var CEPLiveData : MutableLiveData<StateResponse<CEP>>

    fun buscarCEP(cepInserido: String) : MutableLiveData<StateResponse<CEP>> {
        CEPLiveData = cepRemoteRepository.buscarViaCEP(cepUsuario = cepInserido)
        return CEPLiveData
    }

}