package com.ctt.aula06

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.*
import com.ctt.aula06.model.Usuario
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val CICLO_VIDA = "CICLO_VIDA"
    private lateinit var botaoCadastrar : Button
    private lateinit var nomeUsuario : EditText
    private lateinit var idadeUsuario : EditText
    private lateinit var fotoUsuario : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(CICLO_VIDA, "App em OnCreate")

        //Maneiras de referenciar um componente xml na sua Activity:
        //1. findViewById, convencional desde o Java, utilizado nessa Activity
        //2. synthethic do Kotlin, recurso que importa automaticamente
        // import kotlinx.android.synthetic.main.activity_main.*
        //3. view binding, recurso novo disponivel no android jetpack porém não abordaremos.

        botaoCadastrar = findViewById(R.id.btnCadastrar)
        nomeUsuario = findViewById(R.id.edtNomeUsuario)
        idadeUsuario = findViewById(R.id.edtIdadeUsuario)
        fotoUsuario = findViewById(R.id.imgUsuario)

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

        fotoUsuario.setOnClickListener {
            abrirCamera()
        }

    }

    fun abrirCamera(){
        val CAMERA_REQUEST_CODE = 12345
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        if(cameraIntent.resolveActivity(packageManager) != null){
            //Inicie a câmera
            startActivityForResult(cameraIntent, CAMERA_REQUEST_CODE)
        } else{
            Toast.makeText(this, "Opa... Alguma coisa aconteceu! Tente novamente.", Toast.LENGTH_SHORT)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //Verificando se o dado que está vindo é do tipo câmera que eu pedi conforme determinei na linha 63
        //Verificando se não houve erros durante a tirada de foto
        if(requestCode == 12345 && resultCode == RESULT_OK){
            val imagem = data?.extras?.get("data") as Bitmap
            fotoUsuario.setImageBitmap(imagem)
        }
    }

    fun exibirUsuario(usuario: Usuario){
        Toast.makeText(this,
            "Usuário cadastrado com sucesso!",
            Toast.LENGTH_SHORT).show()

        redirecionar(usuario)
    }

    fun redirecionar(usuario: Usuario){
        //Intent(aonde eu estou, (CLASSE) para onde eu vou)
        //CUIDADO!  A classe precisa ser ::class.java pois a Intent pede uma (C)lass
        //Se pudesse, passar uma class KOTLIN, poderia chamar através ::class porém
        //O parâmetro precisaria ser do tipo (KC)lass

        val chaveNomeUsuario = "NOME"
        val chaveIdadeUsuario = "IDADE"

        val destinoActivity = Intent(this@MainActivity, UsuarioActivity::class.java)
        destinoActivity.putExtra(chaveNomeUsuario, usuario.nome)
        destinoActivity.putExtra(chaveIdadeUsuario, usuario.idade)

        //Inicia uma nova Activity
        startActivity(destinoActivity)

        //Encerra Activity ATUAL (MainActivity)
        finish()
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

    override fun onBackPressed() {
        super.onBackPressed()
        Toast.makeText(this,
            "Tchau!",
            Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(CICLO_VIDA, "App em OnDestroy")
    }

}