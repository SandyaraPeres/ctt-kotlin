package com.sandy.buscarcep.repository

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Network {
    companion object{
       fun RetrofitConfig(caminho: String) : Retrofit {
           //https://viacep.com.br/ws/11060002/json/
           //https://viacep.com.br/ws/11525612/json/
           return Retrofit.Builder()
                   //URL base da requisição (api)
                   //"https://viacep.com.br/ws/"
               .baseUrl(caminho)
                   //Responsável por manipular o JSON
               .addConverterFactory(GsonConverterFactory.create())
               .build()
       }
    }
}