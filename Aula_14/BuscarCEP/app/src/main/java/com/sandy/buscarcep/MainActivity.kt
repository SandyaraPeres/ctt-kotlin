package com.sandy.buscarcep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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
        //val cepExemplo = CEP(rua = "Av. Ana Costa", bairro = "Gonzaga", cidade = "Santos", uf="SP")
        //cepExemplo.toString() <- O RETORNO SERÁ NOSSO TOSTRING() PERSONALIZADO :)

        //Criando o servico que conterá as rotas (final da URL) e atribuindo ela
        //a configuração do meu retrofit
        //viacep.com.br/ws/ + "{cepInserido}/json/
        //viacep.com.br/ws/ + "{cepInserido}/xml/
        val servico = retrofitClient.create(CEPService::class.java)
        //Se meu cep = 11060002
        val chamada = servico.buscarCEP(cep)
        //chamada = https://viacep.com.br/ws/11060002/json

        //Realizar a chamada
        //.execute
        //1. Execute: realiza a chamada de maneira SÍNCRONA
        //2. Enqueue: realiza a chamada de maneira ASSÍNCRONA

        //val callback = Callback<CEP>()
        //imageView = setImageURL("www.caminhodaimagem.com.br/cachorrinhofofo.jpg")

        //Call<CEP> = Preparação de uma chamada do tipo CEP
        //Callback<CEP> = FAZER a chamada do tipo CEP, que me trará uma Resposta do tipo CEP
        //Response<CEP> = Resposta da API do tipo CEP

        //SEMPRE UTILIZAR TUDO DO RETROFIT!!!!
        chamada.enqueue(
          object : Callback<CEP> {
              //Comunicação com a API OK!
              override fun onResponse(call: Call<CEP>, response: Response<CEP>) {
                  val endereco = response.body()?.toString()
                  endereco?.let{
                      if(it.isNotEmpty()){
                          respostaCEP.text = it
                      } else {
                          campoCEP.error = "Opa... Não foi retornado endereço nenhum!"
                      }
                  }
              }

              //Falha de rede (timeout)
              //Rota errada
              //FALHA DE COMUNICAÇÃO
              override fun onFailure(call: Call<CEP>, t: Throwable) {
                  respostaCEP.text = "Opa... Houve erro na solicitação." +
                          "\nTente novamente mais tarde."
              }
          }
        )
    }
}