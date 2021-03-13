package com.sandy.buscarcep.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.sandy.buscarcep.model.CEP
import com.sandy.buscarcep.model.StateError
import com.sandy.buscarcep.model.StateResponse
import com.sandy.buscarcep.model.StateSuccess
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

//RESPONSÁVEL SOMENTE PARA REALIZAR CHAMADAS

class CEPRemoteRepository {

    fun buscarViaCEP(cepUsuario: String) : MutableLiveData<StateResponse<CEP>> {
        val cepLiveData = MutableLiveData<StateResponse<CEP>>()

        val retrofitClient = Network.RetrofitConfig("https://viacep.com.br/ws/")
        val servico = retrofitClient.create(CEPService::class.java)
        val chamada = servico.buscarCEP(cepUsuario)

        chamada.enqueue(
            object : Callback<CEP> {
                override fun onResponse(call: Call<CEP>, response: Response<CEP>) {
                    if(response.isSuccessful && response.body() != null){
                        response.body()?.let{
                            cepLiveData.value = StateSuccess(it)
                        }
                    }
                }

                override fun onFailure(call: Call<CEP>, t: Throwable) {
                cepLiveData.value = StateError(t)
                //CEPLocalRepository().buscarCEPLocal()
                }
            }
        )

        return cepLiveData
    }
}