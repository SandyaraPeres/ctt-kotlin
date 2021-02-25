package com.ctt.aula06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_usuario.*

class UsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        val nomeUsuario = intent.extras?.get("NOME")
        val idadeUsuario = intent.extras?.get("IDADE")

        txtDadosUsuario.text = "Oi, $nomeUsuario, você tem $idadeUsuario"
    }
}