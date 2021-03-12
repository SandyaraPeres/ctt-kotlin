package com.sandy.aula17

import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import junit.framework.Assert.*
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows.shadowOf
import org.robolectric.android.controller.ActivityController
import org.robolectric.annotation.Config

//A 4.4 AINDA NÃO TEM SUPORTE PARA O SDK 30
@RunWith(RobolectricTestRunner::class)
@Config(sdk = [29])
class MainActivityTest {

    private lateinit var activity : MainActivity
    private lateinit var controller: ActivityController<MainActivity>

    //1° PASSO - PREPARAR O AMBIENTE DE TESTES
    @Before
    fun setup(){
        controller = Robolectric.buildActivity(MainActivity::class.java)
        activity = controller.create().start().get()
    }

    //3° PASSO - O QUE FAZER APÓS O TESTE, TOTALMENTE OPCIONAL
    @After
    fun tearDown(){
        activity.finish()
    }

    //2° PASSO - TESTE
    @Test
    fun clicarBotaoExibirResultadoComSucesso(){
        val botaoCalcular = activity.findViewById<Button>(R.id.botaoCalcular)
        val primeiroNumero = activity.findViewById<EditText>(R.id.edtPrimeiroNumero)
        val segundoNumero = activity.findViewById<EditText>(R.id.edtSegundoNumero)

        //activity.startNextMatchingActivity(MainActivity2::class.java)

        primeiroNumero.setText("1")
        segundoNumero.setText("2")
        botaoCalcular.performClick()

        val resultadoAtual = activity.findViewById<TextView>(R.id.resultado).text.toString()
        val resultadoEsperado = activity.calcularSoma(1, 2)

        assertEquals(resultadoEsperado, resultadoAtual)
    }

    //TDD: QUAIS SAO OS CENÁRIOS DE ERRO/SUCESSO QUE PODEM OCORRER NO MEU APP?
    @Test
    fun clicarBotaoExibirResultadoErro(){
        val botaoCalcular = activity.findViewById<Button>(R.id.botaoCalcular)
        val primeiroNumero = activity.findViewById<EditText>(R.id.edtPrimeiroNumero)
        val segundoNumero = activity.findViewById<EditText>(R.id.edtSegundoNumero)

        primeiroNumero.setText("")
        segundoNumero.setText("2")
        botaoCalcular.performClick()

        val resultadoEsperadoCalcularSoma = activity.calcularSoma(
            primeiroNumero.text.toString().toIntOrNull(),
            segundoNumero.text.toString().toIntOrNull())

        val resultadoAtual = activity.findViewById<TextView>(R.id.resultado).text.toString()

        assertEquals(resultadoEsperadoCalcularSoma, resultadoAtual)
    }

//    @Test
//    fun somarDoisNumerosComSucesso(){
//        val primeiroNumeroSucesso = 10
//        val segundoNumeroSucesso = 5
//
//        val resultadoFuncao = MainActivity().calcularSoma(primeiroNumeroSucesso, segundoNumeroSucesso)
//        val resultadoEsperado = "O resultado é 15"
//
//        assertEquals(resultadoEsperado, resultadoFuncao)
//    }
//
//    @Test
//    fun somarDoisNumeroSendoOPrimeiroNuloErro(){
//        val primeiroNumeroSucesso = null
//        val segundoNumeroSucesso = 5
//
//        val resultadoFuncao = MainActivity().calcularSoma(primeiroNumeroSucesso, segundoNumeroSucesso)
//        val resultadoEsperado = "Insira um valor válido"
//
//        assertEquals(resultadoEsperado, resultadoFuncao)
//    }
//
//    @Test
//    fun somarDoisNumeroSendoOSegundoNuloErro(){
//        val primeiroNumeroSucesso = 10
//        val segundoNumeroSucesso = null
//
//        val resultadoFuncao = MainActivity().calcularSoma(primeiroNumeroSucesso, segundoNumeroSucesso)
//        val resultadoEsperado = "Insira um valor válido"
//
//        assertEquals(resultadoEsperado, resultadoFuncao)
//    }
//
//    @Test
//    fun somarDoisNumeroSendoAmbosNulosErro(){
//        val primeiroNumeroSucesso = null
//        val segundoNumeroSucesso = null
//
//        val resultadoFuncao = MainActivity().calcularSoma(primeiroNumeroSucesso, segundoNumeroSucesso)
//        val resultadoEsperado = "Insira um valor válido"
//
//        assertEquals(resultadoEsperado, resultadoFuncao)
//    }
}