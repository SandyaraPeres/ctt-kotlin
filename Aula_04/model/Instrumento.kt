package model

interface Instrumento {
    var possuiCordas : Boolean

    fun emitirSom() : String
}