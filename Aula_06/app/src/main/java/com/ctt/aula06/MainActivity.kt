package com.ctt.aula06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.ctt.aula06.model.Usuario

class MainActivity : AppCompatActivity() {

    private val CICLO_VIDA = "CICLO_VIDA"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(CICLO_VIDA, "App em OnCreate")

        //Maneiras de referenciar um componente xml na sua Activity:
        //1. findViewById, convencional desde o Java, utilizado nessa Activity
        //2. synthethic do Kotlin, recurso que importa automaticamente
        // import kotlinx.android.synthetic.main.activity_main.*
        //3. view binding, recurso novo disponivel no android jetpack porém não abordaremos.

        val botaoCadastrar = findViewById<Button>(R.id.btnCadastrar)
        val nomeUsuario = findViewById<EditText>(R.id.edtNomeUsuario)
        val idadeUsuario = findViewById<EditText>(R.id.edtIdadeUsuario)

        var contador = 0

        //Clique de um botão
        botaoCadastrar.setOnClickListener{
            val nomeDigitado = nomeUsuario.text.toString()
            val idadeDigitada = idadeUsuario.text.toString()

            if (nomeDigitado.isEmpty()) {
                if(idadeDigitada.isEmpty()) {
                    idadeUsuario.error = "Você ainda ainda não nasceu?"
                } else {
                    nomeUsuario.error = "Não existe nome vazio, né?"
                }
            } else {
                val usuario = Usuario(++contador, nomeDigitado, idadeDigitada.toInt())
                exibirUsuario(usuario)
            }
        }

    }

    fun exibirUsuario(usuario: Usuario){
        Log.e("USUARIO", usuario.toString())
        Toast.makeText(this,
            "Boas vindas, ${usuario.nome}. Seu id é ${usuario.id}",
            Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.e(CICLO_VIDA, "App em OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(CICLO_VIDA, "App em OnResume")
    }

    override fun onStop() {
        super.onStop()
        Log.e(CICLO_VIDA, "App em OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(CICLO_VIDA, "App em OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(CICLO_VIDA, "App em OnDestroy")
    }

}