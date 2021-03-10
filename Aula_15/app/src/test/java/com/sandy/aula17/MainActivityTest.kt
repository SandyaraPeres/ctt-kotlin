package com.sandy.aula17

import junit.framework.Assert.assertEquals
import org.junit.Test

class MainActivityTest {

    @Test
    fun somarDoisNumerosComSucesso(){
        val primeiroNumeroSucesso = 10
        val segundoNumeroSucesso = 5

        val resultadoFuncao = MainActivity().calcularSoma(primeiroNumeroSucesso, segundoNumeroSucesso)
        val resultadoEsperado = "O resultado é 15"

        assertEquals(resultadoEsperado, resultadoFuncao)
    }

    @Test
    fun somarDoisNumeroSendoOPrimeiroNuloErro(){
        val primeiroNumeroSucesso = null
        val segundoNumeroSucesso = 5

        val resultadoFuncao = MainActivity().calcularSoma(primeiroNumeroSucesso, segundoNumeroSucesso)
        val resultadoEsperado = "Insira um valor válido"

        assertEquals(resultadoEsperado, resultadoFuncao)
    }

    @Test
    fun somarDoisNumeroSendoOSegundoNuloErro(){
        val primeiroNumeroSucesso = 10
        val segundoNumeroSucesso = null

        val resultadoFuncao = MainActivity().calcularSoma(primeiroNumeroSucesso, segundoNumeroSucesso)
        val resultadoEsperado = "Insira um valor válido"

        assertEquals(resultadoEsperado, resultadoFuncao)
    }

    @Test
    fun somarDoisNumeroSendoAmbosNulosErro(){
        val primeiroNumeroSucesso = null
        val segundoNumeroSucesso = null

        val resultadoFuncao = MainActivity().calcularSoma(primeiroNumeroSucesso, segundoNumeroSucesso)
        val resultadoEsperado = "Insira um valor válido"

        assertEquals(resultadoEsperado, resultadoFuncao)
    }
}