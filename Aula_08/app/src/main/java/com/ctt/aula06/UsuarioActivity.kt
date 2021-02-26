package com.ctt.aula06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ctt.aula06.model.Usuario
import kotlinx.android.synthetic.main.activity_usuario.*

class UsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        //String nomeUsuario = getIntent().getExtras().get("NOME")
        val usuario = intent.extras?.get("USUARIO") as Usuario

        //\n = Quebra de linha em uma String
        txtDadosUsuario.text = "Id: ${usuario.id}" +
                "\nNome: ${usuario.nome}" +
                "\nIdade: ${usuario.idade}"

        usuario.foto?.let{
            //it = tudo que eu falei antes do .let
            //imgUsuario.setImageBitmap(usuario.foto)
            imgUsuario.setImageBitmap(it)
        }

//        val nome = "XUXA"
//        val complemento = "MENEGHEL"
//        val stringFinal = nome + complemento (CONCATENAÇÃO)
        
    }
}